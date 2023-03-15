main :: IO()

eliminaMaior :: [Int] -> Int -> [Int]
eliminaMaior (x:xs) n 
    | x == n = xs
    |otherwise = [x] ++ (eliminaMaior xs n)

encontraMaior :: [Int] -> Int
encontraMaior [x] = x
encontraMaior (x:xs)
    | x > encontraMaior xs = x
    | otherwise = encontraMaior xs


removeMaiores :: [Int] -> Int -> [Int]
removeMaiores [] _ = []
removeMaiores xs x
    | x == 0 = xs
    | otherwise = removeMaiores (eliminaMaior
 xs (encontraMaior xs)) (x - 1)


main = do

    listInteiros <- readLn :: IO [Int]
    numero <- readLn :: IO Int

    print (removeMaiores listInteiros numero)