package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a102a240-9cbc-4040-97ad-1a87b99c4a82")
public class Reserva {
    @objid ("573048fb-b198-45e5-a2fd-9b3670ace70d")
    private String HoraFinal;

    @objid ("5b680d2e-472a-476c-8399-5c59153b9253")
    private String HoraInicial;

    @objid ("61b5ff2c-d473-498e-9342-8327fbeb4524")
    private String Fecha;

    @objid ("72130f43-9329-4d46-9e70-0f4d52b32246")
    String getHoraFinal() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.HoraFinal;
    }

    @objid ("6cbd097f-e808-4606-98fe-8bad9a8df810")
    void setHoraFinal(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.HoraFinal = value;
    }

    @objid ("99703e0c-28b3-48f5-8e93-0c4421158c5f")
    String getHoraInicial() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.HoraInicial;
    }

    @objid ("e7a2d4ad-2266-41af-9537-b82f947d4483")
    void setHoraInicial(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.HoraInicial = value;
    }

    @objid ("91f2935a-38a7-4bdb-81c8-37878b11aa78")
    String getFecha() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Fecha;
    }

    @objid ("10ed84a8-253c-4358-b6a7-755e968598ae")
    void setFecha(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Fecha = value;
    }

}
