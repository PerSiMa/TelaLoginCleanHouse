import javax.swing.*;
import java.awt.*;

public class CleanHouseEmployeesSwing extends JFrame {
    public CleanHouseEmployeesSwing() {
        // Configuração da janela
        setTitle("Clean House");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 900);
        setLayout(new BorderLayout());

        // Barra de navegação
        JPanel navPanel = new JPanel(new BorderLayout());
        navPanel.setBackground(new Color(255, 255, 255));
        navPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Logo e ícone
        JLabel logoLabel = new JLabel("CLEAN HOUSE");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        logoLabel.setForeground(new Color(0, 120, 200));
        navPanel.add(logoLabel, BorderLayout.WEST);

        // Barra de busca
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Procurar agora");
        searchButton.setBackground(new Color(0, 120, 200));
        searchButton.setForeground(Color.WHITE);
        JPanel searchPanel = new JPanel();
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        navPanel.add(searchPanel, BorderLayout.CENTER);

        // Botões de navegação e login
        JPanel navLinks = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton servicesNav = new JButton("Serviços");
        JButton findJobNav = new JButton("Procurar Emprego");
        JButton contactNav = new JButton("Fale Conosco");
        JButton loginNav = new JButton("Entre");
        loginNav.setIcon(new ImageIcon("login_icon.png")); // Substitua por caminho real de ícone
        JButton registerNav = new JButton("Cadastre-se");
        navLinks.add(servicesNav);
        navLinks.add(findJobNav);
        navLinks.add(contactNav);
        navLinks.add(loginNav);
        navLinks.add(registerNav);
        navPanel.add(navLinks, BorderLayout.EAST);

        add(navPanel, BorderLayout.NORTH);

        // Painel principal com rolagem
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);

        // Título da seção
        JLabel titleLabel = new JLabel("Estas empregadas estão disponíveis:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(20));

        // Grade de empregados
        JPanel employeesGrid = new JPanel(new GridLayout(7, 3, 15, 15));
        employeesGrid.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        employeesGrid.add(createEmployeePanel("Barbara (30)", "Negociável", "4 meses de experiência", "Disponível não", "barbara.jpg"));
        employeesGrid.add(createEmployeePanel("Eder (42)", "Negociável", "3 anos de experiência", "Disponível não", "eder.jpg"));
        employeesGrid.add(createEmployeePanel("Fabiano (36)", "Negociável", "5 anos de experiência", "Disponível não", "fabiano.jpg"));
        employeesGrid.add(createEmployeePanel("Josef (44)", "Negociável", "2 anos de experiência", "Disponível não", "josef.jpg"));
        employeesGrid.add(createEmployeePanel("Dani (23)", "Negociável", "Nenhum de experiência", "Disponível não", "dani.jpg"));
        employeesGrid.add(createEmployeePanel("Maria (32)", "Negociável", "2 anos de experiência", "Disponível não", "maria.jpg"));
        employeesGrid.add(createEmployeePanel("Claudio (41)", "Negociável", "1 ano de experiência", "Disponível não", "claudio.jpg"));
        employeesGrid.add(createEmployeePanel("Mario (27)", "Negociável", "5 anos de experiência", "Disponível não", "mario.jpg"));
        employeesGrid.add(createEmployeePanel("Ju (18)", "Negociável", "4 meses de experiência", "Disponível não", "ju.jpg"));
        employeesGrid.add(createEmployeePanel("Paulo (37)", "Negociável", "4 meses de experiência", "Disponível não", "paulo.jpg"));
        employeesGrid.add(createEmployeePanel("Liz (22)", "Negociável", "4 meses de experiência", "Disponível não", "liz.jpg"));
        employeesGrid.add(createEmployeePanel("Fabia (44)", "25-35 reais / hora", "4 meses de experiência", "Disponível não", "fabia.jpg"));
        employeesGrid.add(createEmployeePanel("Jaqueline (30)", "Negociável", "2 anos de experiência", "Disponível não", "jaqueline.jpg"));
        employeesGrid.add(createEmployeePanel("Jaque (28)", "Negociável", "Nenhum de experiência", "Disponível não", "jaque.jpg"));
        employeesGrid.add(createEmployeePanel("Kleber (45)", "Negociável", "3 anos de experiência", "Disponível não", "kleber.jpg"));
        employeesGrid.add(createEmployeePanel("Fer (33)", "Negociável", "1 ano de experiência", "Disponível não", "fer.jpg"));
        employeesGrid.add(createEmployeePanel("Aline (23)", "Negociável", "4 meses de experiência", "Disponível não", "aline.jpg"));
        employeesGrid.add(createEmployeePanel("Laura (36)", "Negociável", "4 meses de experiência", "Disponível não", "laura.jpg"));
        employeesGrid.add(createEmployeePanel("Ana (29)", "25-35 reais / hora", "4 meses de experiência", "Disponível não", "ana.jpg"));
        employeesGrid.add(createEmployeePanel("Elion (40)", "Negociável", "5 anos de experiência", "Disponível não", "elion.jpg"));
        mainPanel.add(employeesGrid);

        // Botão "Mostrar serviços"
        JButton showServicesButton = new JButton("Mostrar serviços");
        showServicesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        showServicesButton.setBackground(new Color(0, 120, 200));
        showServicesButton.setForeground(Color.WHITE);
        showServicesButton.setPreferredSize(new Dimension(150, 40));
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(showServicesButton);

        // Adiciona o mainPanel a um JScrollPane
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.CENTER);

        // Rodapé
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(0, 50, 100));
        footerPanel.setLayout(new BoxLayout(footerPanel, BoxLayout.Y_AXIS));
        footerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel footerLogo = new JLabel("CLEAN HOUSE");
        footerLogo.setForeground(Color.WHITE);
        footerLogo.setFont(new Font("Arial", Font.BOLD, 16));
        footerLogo.setAlignmentX(Component.CENTER_ALIGNMENT);
        footerPanel.add(footerLogo);

        JLabel footerText = new JLabel("Amet minim mollit non deserunt ullamco est sit aliqua dolor do");
        footerText.setForeground(Color.WHITE);
        footerText.setAlignmentX(Component.CENTER_ALIGNMENT);
        footerPanel.add(footerText);

        JPanel footerLinks = new JPanel(new GridLayout(1, 3, 20, 20));
        footerLinks.setBackground(new Color(0, 50, 100));
        footerLinks.add(createFooterSection("SERVIÇOS", "House Cleaning", "Office Cleaning", "Window Cleaning", "Floor Cleaning"));
        footerLinks.add(createFooterSection("LINKS", "Home", "Services", "Procurar Emprego", "Fale Conosco"));
        footerLinks.add(createFooterSection("CONTATO", "Phone: (123) 456-7890", "Email: contact@cleanhouse.com", "Address: 123 Clean St", "City, State 12345"));
        footerPanel.add(footerLinks);

        JPanel socialPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        socialPanel.setBackground(new Color(0, 50, 100));
        socialPanel.add(new JLabel(new ImageIcon("facebook_icon.png"))); // Substitua por caminho real
        socialPanel.add(new JLabel(new ImageIcon("instagram_icon.png"))); // Substitua por caminho real
        footerPanel.add(socialPanel);

        JLabel copyright = new JLabel("© 2023 Clean House. All Rights Reserved");
        copyright.setForeground(Color.WHITE);
        copyright.setAlignmentX(Component.CENTER_ALIGNMENT);
        footerPanel.add(copyright);

        add(footerPanel, BorderLayout.SOUTH);
    }

    private JPanel createEmployeePanel(String name, String negotiable, String experience, String availability, String imagePath) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0, 120, 200), 2),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(250, 300));

        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(imageLabel);

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameLabel);

        JLabel negotiableLabel = new JLabel(negotiable);
        negotiableLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(negotiableLabel);

        JLabel experienceLabel = new JLabel(experience);
        experienceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(experienceLabel);

        JLabel availabilityLabel = new JLabel(availability);
        availabilityLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(availabilityLabel);

        JPanel checkboxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        checkboxPanel.add(createCheckBoxIcon("SE"));
        checkboxPanel.add(createCheckBoxIcon("TE"));
        checkboxPanel.add(createCheckBoxIcon("QA"));
        checkboxPanel.add(createCheckBoxIcon("SE"));
        checkboxPanel.add(createCheckBoxIcon("DO"));
        panel.add(checkboxPanel);

        return panel;
    }

    private JComponent createCheckBoxIcon(String text) {
        JLabel label = new JLabel(new ImageIcon("checkbox_icon.png")); // Substitua por caminho real de ícone
        label.setText(text);
        label.setForeground(Color.BLACK);
        return label;
    }

    private JPanel createFooterSection(String title, String... items) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(0, 50, 100));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        for (String item : items) {
            JLabel itemLabel = new JLabel(item);
            itemLabel.setForeground(Color.WHITE);
            itemLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(itemLabel);
        }

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CleanHouseEmployeesSwing frame = new CleanHouseEmployeesSwing();
            frame.setVisible(true);
        });
    }
}