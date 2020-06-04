package ar.com.ada.hoteltresvagos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "reserva" )
public class Reserva {

    @Id
    @Column (name = "reserva_id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int reservaId;
    @Column ( name = "fecha_reserva")
    private Date fechaReserva;
    @Column ( name =" fecha_ingreso")
    private Date fechaIngreso;
    @Column (name =" fecha_egreso")
    private Date fechaEgreso;
    private Integer habitacion;// no le pongo anotacion por q se llama igual an la db
    @Column ( name = " importe_reserva")
    private double importeReserva;
    @Column (name =" importe_total")
    private BigDecimal importeTotal;
    @Column (name= " saldo_pendiente_pgo")
    private BigDecimal saldoPendienteDePago;
    @Column (name = "tipo_estado")
    private int tipoEstadoId;
    
    @ManyToOne 
    @JoinColumn (name = "huesped_id", referencedColumnName = "huesped_id")
    private Huesped huesped;

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    public double getImporteReserva() {
        return importeReserva;
    }

    public void setImporteReserva(double importeReserva) {
        this.importeReserva = importeReserva;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getSaldoPendienteDePago() {
        return saldoPendienteDePago;
    }

    public void setSaldoPendienteDePago(BigDecimal saldoPendienteDePago) {
        this.saldoPendienteDePago = saldoPendienteDePago;
    }

    public int getTipoEstadoId() {
        return tipoEstadoId;
    }

    public void setTipoEstadoId(int tipoEstadoId) {
        this.tipoEstadoId = tipoEstadoId;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
        this.huesped.getReserva().add(this);
    }


}