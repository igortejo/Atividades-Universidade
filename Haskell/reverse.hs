reverse' :: [Int] -> [Int]
reverse' (x:xs)
    | (x:xs) == [] = []
    | otherwise = reverse' xs ++ [x]