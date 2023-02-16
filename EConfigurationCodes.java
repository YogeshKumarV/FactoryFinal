package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName : YogeshKumarV

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@AuditTable(value = "CONFIG_CODES_AUD",schema = "FACTORY_AUD")
@Entity
@Table(name = "FACTORY_DB.CONFIG_CODES",schema = "FACTORY_DB")
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
public class EConfigurationCodes extends TransactionEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "APR_VEH_TIRE_CONDN_SEQ")
    @SequenceGenerator(name = "APR_VEH_TIRE_CONDN_SEQ",sequenceName ="APR_VEH_TIRE_CONDN_SEQ")
    private Long codeId;
    private String codeType;
    private String shortCode;
    private String longCode;
    private String shortDescription;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy="codeId")
    private EDealerRegistration dealerRegistration;

}
