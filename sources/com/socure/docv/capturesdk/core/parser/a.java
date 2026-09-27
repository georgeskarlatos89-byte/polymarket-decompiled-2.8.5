package com.socure.docv.capturesdk.core.parser;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BIRTH_DATE;
    public static final a CITY;
    public static final a COMPLIANCE_INDICATOR;
    public static final a COUNTRY;
    public static final a DATA_SEPARATOR;
    public static final a DRIVER_LICENSE_NAME;
    public static final a DRIVER_LICENSE_NUMBER;
    public static final a EXPIRATION_DATE;
    public static final a EYE_COLOR;
    public static final a FIRST_NAME;
    public static final a FIRST_NAME_TRUNCATION;
    public static final a FORMAT;
    public static final a GIVEN_NAME;
    public static final a GIVEN_NAME_ALIAS;
    public static final a HEIGHT_CM;
    public static final a HEIGHT_IN;
    public static final a ISSUE_DATE;
    public static final a LAST_NAME;
    public static final a LAST_NAME_ALIAS;
    public static final a LAST_NAME_TRUNCATION;
    public static final a MIDDLE_NAME;
    public static final a MIDDLE_NAME_TRUNCATION;
    public static final a POSTAL_CODE;
    public static final a SEX;
    public static final a STATE;
    public static final a STREET_ADDRESS;
    public static final a STREET_ADDRESS_TWO;
    public static final a SUFFIX;
    public static final a UNIQUE_DOCUMENT_ID;
    private final String mvaKey;

    static {
        a aVar = new a("FIRST_NAME", 0, "DAC");
        FIRST_NAME = aVar;
        a aVar2 = new a("LAST_NAME", 1, "DCS");
        LAST_NAME = aVar2;
        a aVar3 = new a("BIRTH_DATE", 2, "DBB");
        BIRTH_DATE = aVar3;
        a aVar4 = new a("DRIVER_LICENSE_NUMBER", 3, "DAQ");
        DRIVER_LICENSE_NUMBER = aVar4;
        a aVar5 = new a("DRIVER_LICENSE_NAME", 4, "DAA");
        DRIVER_LICENSE_NAME = aVar5;
        a aVar6 = new a("EXPIRATION_DATE", 5, "DBA");
        EXPIRATION_DATE = aVar6;
        a aVar7 = new a("SUFFIX", 6, "DBS");
        SUFFIX = aVar7;
        a aVar8 = new a("GIVEN_NAME", 7, "DCT");
        GIVEN_NAME = aVar8;
        a aVar9 = new a("MIDDLE_NAME", 8, "DAD");
        MIDDLE_NAME = aVar9;
        a aVar10 = new a("FIRST_NAME_TRUNCATION", 9, "DDF");
        FIRST_NAME_TRUNCATION = aVar10;
        a aVar11 = new a("MIDDLE_NAME_TRUNCATION", 10, "DDG");
        MIDDLE_NAME_TRUNCATION = aVar11;
        a aVar12 = new a("LAST_NAME_TRUNCATION", 11, "DDE");
        LAST_NAME_TRUNCATION = aVar12;
        a aVar13 = new a("LAST_NAME_ALIAS", 12, "DBN");
        LAST_NAME_ALIAS = aVar13;
        a aVar14 = new a("GIVEN_NAME_ALIAS", 13, "DBG");
        GIVEN_NAME_ALIAS = aVar14;
        a aVar15 = new a("STREET_ADDRESS", 14, "DAG");
        STREET_ADDRESS = aVar15;
        a aVar16 = new a("STREET_ADDRESS_TWO", 15, "DAH");
        STREET_ADDRESS_TWO = aVar16;
        a aVar17 = new a("CITY", 16, "DAI");
        CITY = aVar17;
        a aVar18 = new a("STATE", 17, "DAJ");
        STATE = aVar18;
        a aVar19 = new a("COUNTRY", 18, "DCG");
        COUNTRY = aVar19;
        a aVar20 = new a("POSTAL_CODE", 19, "DAK");
        POSTAL_CODE = aVar20;
        a aVar21 = new a("UNIQUE_DOCUMENT_ID", 20, "DCF");
        UNIQUE_DOCUMENT_ID = aVar21;
        a aVar22 = new a("ISSUE_DATE", 21, "DBD");
        ISSUE_DATE = aVar22;
        a aVar23 = new a("EYE_COLOR", 22, "DAY");
        EYE_COLOR = aVar23;
        a aVar24 = new a("SEX", 23, "DBC");
        SEX = aVar24;
        a aVar25 = new a("HEIGHT_IN", 24, "DAU");
        HEIGHT_IN = aVar25;
        a aVar26 = new a("HEIGHT_CM", 25, "DAV");
        HEIGHT_CM = aVar26;
        a aVar27 = new a("COMPLIANCE_INDICATOR", 26, "@");
        COMPLIANCE_INDICATOR = aVar27;
        a aVar28 = new a("DATA_SEPARATOR", 27, "\n");
        DATA_SEPARATOR = aVar28;
        a aVar29 = new a("FORMAT", 28, "ANSI ");
        FORMAT = aVar29;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29};
        $VALUES = aVarArr;
        $ENTRIES = new wg7(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.mvaKey = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.mvaKey;
    }
}
