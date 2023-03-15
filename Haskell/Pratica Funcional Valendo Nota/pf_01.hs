import Text.Printf
main :: IO()


gasto :: Float -> Float -> Float
gasto consumo custo = consumo * custo

consumo :: Float -> Float -> Float 
consumo potencia tempo_uso = (potencia/1000)*tempo_uso

main = do

    potencia <- readLn
    tempo_uso <- readLn
    custo <- readLn

    printf "Consumo = %.2fkWh\n" (consumo potencia tempo_uso)
    printf "Gasto diário = R$%.2f\n" (gasto (consumo potencia tempo_uso) custo)
    printf "Gasto semanal = R$%.2f\n" ((gasto (consumo potencia tempo_uso) custo) * 7)

