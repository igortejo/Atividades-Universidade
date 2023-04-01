
// IGOR TEJO BEZERRA RIBEIRO NOGUEIRA - 120210131
// ROTEIRO 02 - LOAC


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
  
  
  //Problema 1 – Sistema de Irrigação
  //-----------------------------------
  
	parameter apagado  = 'b00000000;
	parameter mostra_0 = 'b00111111;
	parameter mostra_1 = 'b00000110;
	parameter mostra_2 = 'b01011011;
	
	// variáveis 
	
	logic [1:0] sensorAgua;
	
	// conexões entradas
	
	always_comb sensorAgua <= SWI[1:0];
	
	always_comb begin 
	
	if (sensorAgua == 'b00) 	   SEG <= apagado;
	else if (sensorAgua == 'b01)   SEG <= mostra_0;
	else if (sensorAgua == 'b10)   SEG <= mostra_1;
	else 						   SEG <= mostra_2;
	
	end
	
	
  
   //Problema 2 – Roteador
   //-----------------------------------
	  
	logic [1:0] informacao_A;
	always_comb informacao_A <= SWI[7:6];
	  	
	logic seletor;
	always_comb seletor <= SWI[3];

	logic [1:0] informacao_B;
	always_comb informacao_B <= SWI[5:4];
	
	always_comb begin
	
		if (seletor == 0) LED[7:6] <= informacao_A; 
		else  LED[7:6] <= informacao_B;
	
	end
		
 

endmodule