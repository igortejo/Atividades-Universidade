take' :: [Int] -> Int -> [Int]
take' _ n 
    | n <= 0 = []
take' [] _ = []
take' (x:xs) n = x: take' xs (n-1)