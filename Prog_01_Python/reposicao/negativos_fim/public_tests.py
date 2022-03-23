import unittest
import sys

module = sys.argv[-1].split(".py")[0]

class PublicTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        global negativos_no_fim
        undertest = __import__(module)
        negativos_no_fim = getattr(undertest, 'negativos_no_fim', None)

    def test_exemplo(self):
        fila = [12, -21, -35, 8, 12, 15]
        assert negativos_no_fim(fila) == None
        assert fila == [12, 12, 15, 8, -21, -35]

if __name__ == '__main__':
    loader = unittest.TestLoader()
    runner = unittest.TextTestRunner()
    runner.run(loader.loadTestsFromModule(sys.modules[__name__]))
