import unittest
import sys

module = sys.argv[-1].split(".py")[0]

class PublicTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        global pares_primeiro
        undertest = __import__(module)
        pares_primeiro = getattr(undertest, 'pares_primeiro', None)

    def test_1_publico(self):
        lista = [3, 6, 4, 0, 7, 8, 11]
        assert pares_primeiro(lista) == [6, 4, 0, 8, 3, 7, 11]
        assert lista == [3, 6, 4, 0, 7, 8, 11]


if __name__ == '__main__':
    loader = unittest.TestLoader()
    runner = unittest.TextTestRunner()
    runner.run(loader.loadTestsFromModule(sys.modules[__name__]))
