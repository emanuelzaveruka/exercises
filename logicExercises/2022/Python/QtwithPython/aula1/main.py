import sys
from PySide6.QtWidgets import QApplication, QLabel

app = QApplication()

label = QLabel("Hello World")
label.show()

app.exec()