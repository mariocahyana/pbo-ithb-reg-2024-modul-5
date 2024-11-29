package View;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class KTPView extends JFrame {
    private JTextField nikField, namaField, tempatLahirField, alamatField, rtRwField, kelurahanField, kecamatanField,
            berlakuHinggaField, kotaPembuatanField, wnaField;
    private JComboBox<String> agamaBox, statusPerkawinanBox;
    private JRadioButton priaButton, wanitaButton, wniButton, wnaButton;
    private JCheckBox pekerjaanKaryawan, pekerjaanPns, pekerjaanWiraswasta, pekerjaanAkademisi, pekerjaanPengangguran;
    private JButton fotoButton, tandaTanganButton, insertButton;
    private JDatePickerImpl tanggalLahirPicker, tanggalPembuatanPicker;
    private ButtonGroup genderGroup, kewarganegaraanGroup;
    private JLabel fotoPathLabel, tandaTanganPathLabel;

    public KTPView() {
        setTitle("Form Input Data KTP");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("NIK:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0; gbc.anchor = GridBagConstraints.WEST;
        nikField = new JTextField(20);
        add(nikField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST;
        namaField = new JTextField(20);
        add(namaField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Tempat Lahir:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST;
        tempatLahirField = new JTextField(20);
        add(tempatLahirField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Tanggal Lahir:"), gbc);
        gbc.gridx = 1; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST;
        tanggalLahirPicker = createDatePicker();
        add(tanggalLahirPicker, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Jenis Kelamin:"), gbc);
        gbc.gridx = 1; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST;
        priaButton = new JRadioButton("Pria");
        wanitaButton = new JRadioButton("Wanita");
        genderGroup = new ButtonGroup();
        genderGroup.add(priaButton);
        genderGroup.add(wanitaButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(priaButton);
        genderPanel.add(wanitaButton);
        add(genderPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 5; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Golongan Darah:"), gbc);
        gbc.gridx = 1; gbc.gridy = 5; gbc.anchor = GridBagConstraints.WEST;
        JPanel bloodPanel = new JPanel();
        JRadioButton aButton = new JRadioButton("A");
        JRadioButton bButton = new JRadioButton("B");
        JRadioButton oButton = new JRadioButton("O");
        JRadioButton abButton = new JRadioButton("AB");
        ButtonGroup bloodGroup = new ButtonGroup();
        bloodGroup.add(aButton);
        bloodGroup.add(bButton);
        bloodGroup.add(oButton);
        bloodGroup.add(abButton);
        bloodPanel.add(aButton);
        bloodPanel.add(bButton);
        bloodPanel.add(oButton);
        bloodPanel.add(abButton);
        add(bloodPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 6; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Alamat:"), gbc);
        gbc.gridx = 1; gbc.gridy = 6; gbc.anchor = GridBagConstraints.WEST;
        alamatField = new JTextField(20);
        add(alamatField, gbc);

        gbc.gridx = 0; gbc.gridy = 7; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("RT/RW:"), gbc);
        gbc.gridx = 1; gbc.gridy = 7; gbc.anchor = GridBagConstraints.WEST;
        rtRwField = new JTextField(20);
        add(rtRwField, gbc);

        gbc.gridx = 0; gbc.gridy = 8; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Kelurahan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 8; gbc.anchor = GridBagConstraints.WEST;
        kelurahanField = new JTextField(20);
        add(kelurahanField, gbc);

        gbc.gridx = 0; gbc.gridy = 9; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Kecamatan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 9; gbc.anchor = GridBagConstraints.WEST;
        kecamatanField = new JTextField(20);
        add(kecamatanField, gbc);

        gbc.gridx = 0; gbc.gridy = 10; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Agama:"), gbc);
        gbc.gridx = 1; gbc.gridy = 10; gbc.anchor = GridBagConstraints.WEST;
        agamaBox = new JComboBox<>(new String[]{"Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu"});
        add(agamaBox, gbc);

        gbc.gridx = 0; gbc.gridy = 11; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Status Perkawinan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 11; gbc.anchor = GridBagConstraints.WEST;
        statusPerkawinanBox = new JComboBox<>(new String[]{"Belum Menikah", "Menikah", "Janda/Duda"});
        add(statusPerkawinanBox, gbc);

        gbc.gridx = 0; gbc.gridy = 12; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Pekerjaan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 12; gbc.anchor = GridBagConstraints.WEST;
        JPanel pekerjaanPanel = new JPanel();
        pekerjaanKaryawan = new JCheckBox("Karyawan Swasta");
        pekerjaanPns = new JCheckBox("PNS");
        pekerjaanWiraswasta = new JCheckBox("Wiraswasta");
        pekerjaanAkademisi = new JCheckBox("Akademisi");
        pekerjaanPengangguran = new JCheckBox("Pengangguran");
        pekerjaanPanel.add(pekerjaanKaryawan);
        pekerjaanPanel.add(pekerjaanPns);
        pekerjaanPanel.add(pekerjaanWiraswasta);
        pekerjaanPanel.add(pekerjaanAkademisi);
        pekerjaanPanel.add(pekerjaanPengangguran);
        add(pekerjaanPanel, gbc);

        pekerjaanPengangguran.addItemListener(e -> {
            boolean selected = pekerjaanPengangguran.isSelected();
            pekerjaanKaryawan.setEnabled(!selected);
            pekerjaanPns.setEnabled(!selected);
            pekerjaanWiraswasta.setEnabled(!selected);
            pekerjaanAkademisi.setEnabled(!selected);
        });

        gbc.gridx = 0; gbc.gridy = 13; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Kewarganegaraan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 13; gbc.anchor = GridBagConstraints.WEST;
        wniButton = new JRadioButton("WNI");
        wnaButton = new JRadioButton("WNA");
        kewarganegaraanGroup = new ButtonGroup();
        kewarganegaraanGroup.add(wniButton);
        kewarganegaraanGroup.add(wnaButton);
        JPanel kewarganegaraanPanel = new JPanel();
        kewarganegaraanPanel.add(wniButton);
        kewarganegaraanPanel.add(wnaButton);
        wnaField = new JTextField(10);
        wnaField.setVisible(false);
        kewarganegaraanPanel.add(wnaField);
        add(kewarganegaraanPanel, gbc);

        wnaButton.addActionListener(e -> wnaField.setVisible(true));
        wniButton.addActionListener(e -> {
            wnaField.setVisible(false);
            wnaField.setText("");
        });

        gbc.gridx = 0; gbc.gridy = 14; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Foto:"), gbc);
        gbc.gridx = 1; gbc.gridy = 14; gbc.anchor = GridBagConstraints.WEST;
        fotoButton = new JButton("Upload Foto");
        fotoPathLabel = new JLabel("No file selected");
        add(fotoButton, gbc);
        gbc.gridx = 2; gbc.gridy = 14;
        add(fotoPathLabel, gbc);

        fotoButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                fotoPathLabel.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

        gbc.gridx = 0; gbc.gridy = 15; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Tanda Tangan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 15; gbc.anchor = GridBagConstraints.WEST;
        tandaTanganButton = new JButton("Upload Tanda Tangan");
        tandaTanganPathLabel = new JLabel("No file selected");
        add(tandaTanganButton, gbc);
        gbc.gridx = 2; gbc.gridy = 15;
        add(tandaTanganPathLabel, gbc);

        tandaTanganButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                tandaTanganPathLabel.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

        gbc.gridx = 0; gbc.gridy = 16; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Berlaku Hingga:"), gbc);
        gbc.gridx = 1; gbc.gridy = 16; gbc.anchor = GridBagConstraints.WEST;
        berlakuHinggaField = new JTextField(20);
        add(berlakuHinggaField, gbc);

        gbc.gridx = 0; gbc.gridy = 17; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Kota Pembuatan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 17; gbc.anchor = GridBagConstraints.WEST;
        kotaPembuatanField = new JTextField(20);
        add(kotaPembuatanField, gbc);

        gbc.gridx = 0; gbc.gridy = 18; gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Tanggal Pembuatan:"), gbc);
        gbc.gridx = 1; gbc.gridy = 18; gbc.anchor = GridBagConstraints.WEST;
        tanggalPembuatanPicker = createDatePicker();
        add(tanggalPembuatanPicker, gbc);

        gbc.gridx = 0; gbc.gridy = 19; gbc.gridwidth = 2; gbc.anchor = GridBagConstraints.CENTER;
        insertButton = new JButton("Insert Data");
        add(insertButton, gbc);
    }

    private JDatePickerImpl createDatePicker() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        return new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }

    public JTextField getNikField() {
        return nikField;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public JTextField getNamaField() {
        return namaField;
    }

    public JTextField getTempatLahirField() {
        return tempatLahirField;
    }

    public JDatePickerImpl getTanggalLahirPicker() {
        return tanggalLahirPicker;
    }

    public JRadioButton getPriaButton() {
        return priaButton;
    }

    public JRadioButton getWanitaButton() {
        return wanitaButton;
    }

    public JTextField getAlamatField() {
        return alamatField;
    }

    public JTextField getRtRwField() {
        return rtRwField;
    }

    public JTextField getKelurahanField() {
        return kelurahanField;
    }

    public JTextField getKecamatanField() {
        return kecamatanField;
    }

    public JComboBox<String> getAgamaBox() {
        return agamaBox;
    }

    public JComboBox<String> getStatusPerkawinanBox() {
        return statusPerkawinanBox;
    }

    public JCheckBox getPekerjaanKaryawan() {
        return pekerjaanKaryawan;
    }

    public JCheckBox getPekerjaanPns() {
        return pekerjaanPns;
    }

    public JCheckBox getPekerjaanWiraswasta() {
        return pekerjaanWiraswasta;
    }

    public JCheckBox getPekerjaanAkademisi() {
        return pekerjaanAkademisi;
    }

    public JCheckBox getPekerjaanPengangguran() {
        return pekerjaanPengangguran;
    }

    public JRadioButton getWniButton() {
        return wniButton;
    }

    public JRadioButton getWnaButton() {
        return wnaButton;
    }

    public JTextField getBerlakuHinggaField() {
        return berlakuHinggaField;
    }

    public JTextField getKotaPembuatanField() {
        return kotaPembuatanField;
    }

    public JDatePickerImpl getTanggalPembuatanPicker() {
        return tanggalPembuatanPicker;
    }

    public String getFotoPath() {
        return fotoPathLabel.getText();
    }

    public String getTandaTanganPath() {
        return tandaTanganPathLabel.getText();
    }

    public JTextField getWnaField() {
        return wnaField;
    }
}
