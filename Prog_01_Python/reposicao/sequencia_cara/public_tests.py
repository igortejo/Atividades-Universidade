import unittest
import sys

module = sys.argv[-1].split(".py")[0]

class PublicTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        global sequencia_caras
        undertest = __import__(module)
        sequencia_caras = getattr(undertest, 'sequencia_caras', None)

    def test_1_exemplo(self):
        jogo1 = [0,1,1,0,1,0,0,0]
        assert sequencia_caras( jogo1 ) == 2

    def test_2_exemplo(self):
        jogo2 = [1,0,1]
        assert sequencia_caras( jogo2 ) == 1

    def test_3_exemplo(self):
        jogo3 = [0,1,1,1,0]
        assert sequencia_caras( jogo3 ) == 3

if __name__ == '__main__':
    loader = unittest.TestLoader()
    runner = unittest.TextTestRunner()
    runner.run(loader.loadTestsFromModule(sys.modules[__name__]))
