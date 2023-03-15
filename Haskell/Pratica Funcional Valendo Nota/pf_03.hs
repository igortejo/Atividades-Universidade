import Text.Printf
main :: IO()

contaLetras :: Int -> Int -> String -> (Int,Int)
contaLetras qtdVogais qtdConso [] = (qtdVogais,qtdConso)
contaLetras qtdVogais qtdConso (x:xs) = if x `elem` "AaEeIiOoUu" then contaLetras (qtdVogais +1) qtdConso xs
                                        else contaLetras qtdVogais (qtdConso +1) xs 

verificaMaior :: String -> String
verificaMaior palavra 
    | qtdVogais > qtdConso = "+vogais"
    | qtdVogais < qtdConso = "+consoantes"
    | otherwise = "consoantes=vogais"
    where
        qtdVogais = fst (contaLetras 0 0 palavra)
        qtdConso = snd (contaLetras 0 0 palavra)


main = do
    palavra <- getLine //pra pegar string

    putStrLn (verificaMaior palavra)  -- pra imprimir textos
    
    -- usa print pra numeros, listas, tuplas
    -- readLn ::IO Float 
