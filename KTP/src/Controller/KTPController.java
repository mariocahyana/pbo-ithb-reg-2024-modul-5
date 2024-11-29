package Controller;

import Model.KTPModel;
import View.KTPView;
import View.KTPResultView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KTPController {
    private KTPModel model;
    private KTPView view;

    public KTPController(KTPModel model, KTPView view) {
        this.model = model;
        this.view = view;

        view.getInsertButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setNik(view.getNikField().getText());
                model.setNama(view.getNamaField().getText());
                model.setTempatLahir(view.getTempatLahirField().getText());
                model.setTanggalLahir((java.util.Date) view.getTanggalLahirPicker().getModel().getValue());

                if (view.getPriaButton().isSelected()) {
                    model.setJenisKelamin("Pria");
                } else if (view.getWanitaButton().isSelected()) {
                    model.setJenisKelamin("Wanita");
                }

                model.setAlamat(view.getAlamatField().getText());
                model.setRtRw(view.getRtRwField().getText());
                model.setKelurahan(view.getKelurahanField().getText());
                model.setKecamatan(view.getKecamatanField().getText());

                model.setAgama((String) view.getAgamaBox().getSelectedItem());

                model.setStatusPerkawinan((String) view.getStatusPerkawinanBox().getSelectedItem());

                ArrayList<String> pekerjaan = new ArrayList<>();
                if (view.getPekerjaanKaryawan().isSelected()) {
                    pekerjaan.add("Karyawan Swasta");
                }
                if (view.getPekerjaanPns().isSelected()) {
                    pekerjaan.add("PNS");
                }
                if (view.getPekerjaanWiraswasta().isSelected()) {
                    pekerjaan.add("Wiraswasta");
                }
                if (view.getPekerjaanAkademisi().isSelected()) {
                    pekerjaan.add("Akademisi");
                }
                if (view.getPekerjaanPengangguran().isSelected()) {
                    pekerjaan.clear();
                    pekerjaan.add("Pengangguran");
                }
                model.setPekerjaan(pekerjaan);

                if (view.getWniButton().isSelected()) {
                    model.setKewarganegaraan("WNI");
                } else if (view.getWnaButton().isSelected()) {
                    model.setKewarganegaraan("WNA");
                }

                model.setFotoPath(view.getFotoPath());
                model.setTandaTanganPath(view.getTandaTanganPath());

                model.setBerlakuHingga(view.getBerlakuHinggaField().getText());
                model.setKotaPembuatanKTP(view.getKotaPembuatanField().getText());
                model.setTanggalPembuatanKTP((java.util.Date) view.getTanggalPembuatanPicker().getModel().getValue());

                if (!model.isValid()) {
                    JOptionPane.showMessageDialog(view, "Data tidak lengkap!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                KTPResultView resultView = new KTPResultView();
                resultView.setKTPData(
                        model.getNik(),
                        model.getNama(),
                        model.getTempatLahir() + ", " + model.getTanggalLahir(),
                        model.getJenisKelamin(),
                        model.getGolonganDarah(),
                        model.getAlamat(),
                        model.getRtRw(),
                        model.getKelurahan(),
                        model.getKecamatan(),
                        model.getAgama(),
                        model.getStatusPerkawinan(),
                        String.join(", ", model.getPekerjaan()),
                        model.getKewarganegaraan(),
                        model.getBerlakuHingga(),
                        model.getKotaPembuatanKTP() + ", " + model.getTanggalPembuatanKTP(),
                        model.getFotoPath(),
                        model.getTandaTanganPath());
                resultView.setVisible(true);
                view.dispose();
            }
        });
    }
}
