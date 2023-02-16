package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName:YogeshKumarV

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@AuditTable(value = "APR_VEH_TIRE_CONDN_AUD", schema = "FACTORY_AUD")
@Entity
@Table(name = "FACTORY_DB.APR_VEH_TIRE_CONDN",schema = "FACTORY_DB")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EAppraisalVehicleTireCondition extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "APR_VEH_TIRE_CONDN_SEQ")
    @SequenceGenerator(name = "APR_VEH_TIRE_CONDN_SEQ", sequenceName = "APR_VEH_TIRE_CONDN_SEQ")
    @Column(name = "V_TIRE_CONDN_ID")
    private long vehicleTireConditionId;

    @Column(name = "APR_STATUS_ID")
    private long appraisalStatusId;
    @Column(name = "T_265_OR_70R18")
    private boolean tireWidth;

    private boolean fourMatch;
    private boolean mismatched;
    @Column(name = "XLNT_TREAD")
    private boolean excellentTread;
    private boolean goodTread;
    private boolean poorTread;
    @Column(name = "NEEDS_RPLC")
    private boolean needsReplacement;
    @Column(name = "F_UNEVEN_WEAR_PTRN")
    private boolean frontUnevenWearPattern;
    @Column(name = "F_TIRES_BAD")
    private boolean frontTiresBad;
    @Column(name = "R_TIRES_BAD")
    private boolean rearTiresBad;

    @Column(name = "NO_SPARE_TIRE")
    private boolean noSpareTire;
    @Column(name = "SPARE_TIRE_ON_VEH")
    private boolean spareTireOnVehicle;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EConfigurationCodes.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "APR_STATUS_ID",nullable = false,referencedColumnName = "APR_STATUS_ID")
    private EAppraisalTestDriveStatus appraisalTestDriveStatus;
}