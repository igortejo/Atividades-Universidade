import unittest
import sys

module = sys.argv[-1].split(".py")[0]


class PublicTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        global gera_filas
        undertest = __import__(module)
        gera_filas = getattr(undertest, 'gera_filas', None)

    def test_exemplo1(self):
        fila_unica = [ 'Andre', 'Antonio', 'Bianca', 'Carlos', 'Claudia']
        assert gera_filas(fila_unica, 3) == [['Andre','Carlos'],['Antonio', 'Claudia'], ['Bianca']]        

    def test_exemplo2(self):
        fila_unica = ['Andre', 'Antonio', 'Bianca', 'Carlos']
        assert gera_filas(fila_unica, 2) == [['Andre','Bianca'],['Antonio', 'Carlos']]

if __name__ == '__main__':
    loader = unittest.TestLoader()
    runner = unittest.TextTestRunner()
    runner.run(loader.loadTestsFromModule(sys.modules[__name__]))
