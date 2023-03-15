elem' :: (Eq a) => a -> [a] -> Bool
elem' n  [] = False
elem' n (x:xs) = if n == x then True
                 else elem' n xs