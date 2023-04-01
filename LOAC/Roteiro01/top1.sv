
// IGOR TEJO BEZERRA RIBEIRO NOGUEIRA - 120210131
// ROTEIRO 01 - LOAC


// DESCRIPTION: Verilator: Systemverilog example module
// with interface to switch buttons, LEDs, LCD and register display

parameter divide_by=100000000;  // divisor do clock de referência
// A frequencia do clock de referencia é 50 MHz.
// A frequencia de clk_2 será de  50 MHz / divide_by

parameter NBITS_INSTR = 32;
parameter NBITS_TOP = 8, NREGS_TOP = 32, NBITS_LCD = 64;
module top(input  logic clk_2,
           input  logic [NBITS_TOP-1:0] SWI,
           output logic [NBITS_TOP-1:0] LED,
           output logic [NBITS_TOP-1:0] SEG,
           output logic [NBITS_LCD-1:0] lcd_a, lcd_b,
           output logic [NBITS_INSTR-1:0] lcd_instruction,
           output logic [NBITS_TOP-1:0] lcd_registrador [0:NREGS_TOP-1],
           output logic [NBITS_TOP-1:0] lcd_pc, lcd_SrcA, lcd_SrcB,
             lcd_ALUResult, lcd_Result, lcd_WriteData, lcd_ReadData, 
           output logic lcd_MemWrite, lcd_Branch, lcd_MemtoReg, lcd_RegWrite);

  always_comb begin
    //SEG <= SWI;
    lcd_WriteData <= SWI;
    lcd_pc <= 'h12;
    lcd_instruction <= 'h34567890;
    lcd_SrcA <= 'hab;
    lcd_SrcB <= 'hcd;
    lcd_ALUResult <= 'hef;
    lcd_Result <= 'h11;
    lcd_ReadData <= 'h33;
    lcd_MemWrite <= SWI[0];
    lcd_Branch <= SWI[1];
    lcd_MemtoReg <= SWI[2];
    lcd_RegWrite <= SWI[3];
    for(int i=0; i<NREGS_TOP; i++)
       if(i != NREGS_TOP/2-1) lcd_registrador[i] <= i+i*16;
       else                   lcd_registrador[i] <= ~SWI;
    lcd_a <= {56'h1234567890ABCD, SWI};
    lcd_b <= {SWI, 56'hFEDCBA09876543};
  end
  
  
  //Problema 1 – Agência Bancária
  //-----------------------------------
  
	
	// variáveis
	logic porta_cofre;
	logic relogio_eletronico;
	logic interruptor_gerente;
	logic alarme;	

	// conexões entradas
	always_comb porta_cofre <= SWI[0];
	always_comb relogio_eletronico <= SWI[1];
	always_comb interruptor_gerente <= SWI[2];
	
	// conexões saída
	always_comb LED[1] <= alarme;
	
	always_comb begin
		// como a porta do cofre aberta é 0, temos que negar porta_cofre.
		if ((!porta_cofre & !(relogio_eletronico)) | (!porta_cofre & interruptor_gerente))
			 alarme <= 1;
		else alarme <= 0;
	end
	
	
  
   //Problema 2 – Estufa
   //-----------------------------------
	  
	  // variáveis
	  logic temp_maior_15;
	  logic temp_maior_20;
	  logic aquecedor;
	  logic resfriador;
	  logic inconsistencia;
	  
	  // conexões entradas
	  always_comb temp_maior_15 <= SWI[7];
	  always_comb temp_maior_20 <= SWI[6];
	  
	  // conexões saidas
	  always_comb  LED[7] <= aquecedor;
	  always_comb LED[6] <= resfriador;
	  always_comb SEG[7] <= inconsistencia;
	  
	  always_comb aquecedor <= ~(temp_maior_15 | temp_maior_20);
	  always_comb resfriador <= (temp_maior_15 & temp_maior_20);
	  always_comb inconsistencia <= (~temp_maior_15 & temp_maior_20);
 

endmodule