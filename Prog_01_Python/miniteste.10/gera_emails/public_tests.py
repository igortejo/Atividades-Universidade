import unittest
import sys

module = sys.argv[-1].split(".py")[0]

class AcceptanceTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        global gera_emails
        undertest = __import__(module)
        gera_emails = getattr(undertest, 'gera_emails', None)

    def test_exemplo(self):
        nomes = ['Mariana Silva Lima', 'Joao Arthur', 'Pedro Alvares Cabral']
        emails = ['mariana.lima@ccc.ufcg.edu.br', 'joao.arthur@ccc.ufcg.edu.br', 'pedro.cabral@ccc.ufcg.edu.br']
        assert gera_emails(nomes) == emails


if __name__ == '__main__':
    loader = unittest.TestLoader()
    runner = unittest.TextTestRunner()
    runner.run(loader.loadTestsFromModule(sys.modules[__name__]))
