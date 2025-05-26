import javax.swing.*;
import java.awt.*;

public class CleanHouseSwing extends JFrame {
    public CleanHouseSwing() {
        // Configuração da janela
        setTitle("Clean House");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLayout(new BorderLayout());

        // Barra de navegação
        JPanel navPanel = new JPanel(new BorderLayout());
        navPanel.setBackground(new Color(255, 255, 255));
        navPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel logoLabel = new JLabel("CLEAN HOUSE");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        logoLabel.setForeground(new Color(0, 120, 200));
        navPanel.add(logoLabel, BorderLayout.WEST);

        JPanel navLinks = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton servicesNav = new JButton("Serviços");
        JButton findJobNav = new JButton("Procurar Emprego");
        JButton contactNav = new JButton("Fale Conosco");
        JButton loginNav = new JButton("Entre");
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

        // Seção de banner
        JPanel bannerPanel = new JPanel();
        bannerPanel.setBackground(new Color(0, 120, 200));
        bannerPanel.setPreferredSize(new Dimension(900, 200));
        JLabel bannerLabel = new JLabel("PROFISSIONAL LIMPEZA SERVIÇOS");
        bannerLabel.setForeground(Color.WHITE);
        bannerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        bannerPanel.add(bannerLabel);
        mainPanel.add(bannerPanel);

        // Seção "Sobre Nós"
        JPanel aboutPanel = new JPanel();
        aboutPanel.setLayout(new BoxLayout(aboutPanel, BoxLayout.Y_AXIS));
        aboutPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        aboutPanel.setPreferredSize(new Dimension(900, 200)); // Ajusta o tamanho do painel

        JLabel aboutTitle = new JLabel("RÁPIDO E FÁCIL");
        aboutTitle.setFont(new Font("Arial", Font.BOLD, 20));
        aboutTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        aboutTitle.setHorizontalAlignment(SwingConstants.CENTER);
        aboutPanel.add(aboutTitle);

        JLabel aboutText = new JLabel("<html>Amet minim mollit non deserunt ullamco est sit aliqua dolor do<br>consequat sunt nostrud. Amet minim mollit non deserunt ullamco.</html>");
        aboutText.setAlignmentX(Component.CENTER_ALIGNMENT);
        aboutText.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto dentro do JLabel
        aboutPanel.add(aboutText);

        JLabel awardText = new JLabel("AWARD WINNING COMPANY");
        awardText.setFont(new Font("Arial", Font.BOLD, 14));
        awardText.setAlignmentX(Component.CENTER_ALIGNMENT);
        awardText.setHorizontalAlignment(SwingConstants.CENTER);
        aboutPanel.add(awardText);

        JButton servicesButton = new JButton("Serviços");
        servicesButton.setBackground(new Color(0, 120, 200));
        servicesButton.setForeground(Color.WHITE);
        servicesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        aboutPanel.add(servicesButton);
        mainPanel.add(aboutPanel);

        // Seção "Profissionais"
        JPanel prosPanel = new JPanel();
        prosPanel.setLayout(new BoxLayout(prosPanel, BoxLayout.Y_AXIS));
        prosPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel prosTitle = new JLabel("PROFISSIONAIS");
        prosTitle.setFont(new Font("Arial", Font.BOLD, 20));
        prosTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        prosPanel.add(prosTitle);

        JPanel prosGrid = new JPanel(new GridLayout(1, 4, 10, 10));
        prosGrid.add(createProPanel("Devon Silva", "Manutenção", "devon_silva.jpg"));
        prosGrid.add(createProPanel("Emma Fisher", "Limpeza de Casa", "emma_fisher.jpg"));
        prosGrid.add(createProPanel("Eva Edwards", "Limpeza Comercial", "eva_edwards.jpg"));
        prosGrid.add(createProPanel("Edward Cooper", "Cortador de Grama", "edward_cooper.jpg"));
        prosPanel.add(prosGrid);
        mainPanel.add(prosPanel);

        // Seção "Clientes"
        JPanel clientsPanel = new JPanel();
        clientsPanel.setLayout(new BoxLayout(clientsPanel, BoxLayout.Y_AXIS));
        clientsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel clientsTitle = new JLabel("O QUE NOSSOS CLIENTES DIZEM");
        clientsTitle.setFont(new Font("Arial", Font.BOLD, 20));
        clientsTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        clientsPanel.add(clientsTitle);

        JPanel clientsGrid = new JPanel(new GridLayout(1, 3, 10, 10));
        clientsGrid.add(createClientPanel("Courtney Henry", "Aliquam et magna sit amet."));
        clientsGrid.add(createClientPanel("Darrell Steward", "Aliquam et magna sit amet."));
        clientsGrid.add(createClientPanel("Jerome Bell", "Aliquam et magna sit amet."));
        clientsPanel.add(clientsGrid);
        mainPanel.add(clientsPanel);

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

        JLabel copyright = new JLabel("© 2023 Clean House. All Rights Reserved");
        copyright.setForeground(Color.WHITE);
        copyright.setAlignmentX(Component.CENTER_ALIGNMENT);
        footerPanel.add(copyright);

        add(footerPanel, BorderLayout.SOUTH);
    }

    private JPanel createProPanel(String name, String role, String imagePath) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panel.setBackground(Color.WHITE);

        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(imageLabel);

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameLabel);

        JLabel roleLabel = new JLabel(role);
        roleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(roleLabel);

        return panel;
    }

    private JPanel createClientPanel(String name, String review) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panel.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameLabel);

        JLabel reviewLabel = new JLabel(review);
        reviewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(reviewLabel);

        JLabel stars = new JLabel("★★★★★");
        stars.setForeground(new Color(255, 215, 0));
        stars.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(stars);

        return panel;
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
            CleanHouseSwing frame = new CleanHouseSwing();
            frame.setVisible(true);
        });
    }
}