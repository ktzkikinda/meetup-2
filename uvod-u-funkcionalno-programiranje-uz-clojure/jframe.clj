(import 'javax.swing.JFrame)
(import 'javax.swing.JButton)
(import 'javax.swing.JPanel)

(def window (JFrame. "Prozor"))
(.setSize window 480 320)
(.setVisible window true)

(def panel (JPanel.))
(.setContentPane window panel)

(def button (JButton. "Dugme!"))
(.add panel button)

(def button2 (JButton. "Jos jedno dugme!"))
(.add panel button2)

(.setVisible button true)
(.setVisible button2 true)

(.revalidate button)
(.revalidate button2)
