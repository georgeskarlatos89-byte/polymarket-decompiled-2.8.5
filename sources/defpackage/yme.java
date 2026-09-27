package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yme {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yme[] $VALUES;
    public static final yme ADMINISTRATIVE_AREA_LEVEL_1;
    public static final yme ADMINISTRATIVE_AREA_LEVEL_2;
    public static final yme ADMINISTRATIVE_AREA_LEVEL_3;
    public static final yme ADMINISTRATIVE_AREA_LEVEL_4;
    public static final yme COUNTRY;
    public static final yme LOCALITY;
    public static final yme NEIGHBORHOOD;
    public static final yme POSTAL_CODE;
    public static final yme POSTAL_TOWN;
    public static final yme PREMISE;
    public static final yme ROUTE;
    public static final yme STREET_NUMBER;
    public static final yme SUBLOCALITY;
    public static final yme SUBLOCALITY_LEVEL_1;
    public static final yme SUBLOCALITY_LEVEL_2;
    public static final yme SUBLOCALITY_LEVEL_3;
    public static final yme SUBLOCALITY_LEVEL_4;
    private final String value;

    static {
        yme ymeVar = new yme("ADMINISTRATIVE_AREA_LEVEL_1", 0, PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1);
        ADMINISTRATIVE_AREA_LEVEL_1 = ymeVar;
        yme ymeVar2 = new yme("ADMINISTRATIVE_AREA_LEVEL_2", 1, PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2);
        ADMINISTRATIVE_AREA_LEVEL_2 = ymeVar2;
        yme ymeVar3 = new yme("ADMINISTRATIVE_AREA_LEVEL_3", 2, PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3);
        ADMINISTRATIVE_AREA_LEVEL_3 = ymeVar3;
        yme ymeVar4 = new yme("ADMINISTRATIVE_AREA_LEVEL_4", 3, PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4);
        ADMINISTRATIVE_AREA_LEVEL_4 = ymeVar4;
        yme ymeVar5 = new yme("COUNTRY", 4, "country");
        COUNTRY = ymeVar5;
        yme ymeVar6 = new yme("LOCALITY", 5, PlaceTypes.LOCALITY);
        LOCALITY = ymeVar6;
        yme ymeVar7 = new yme("NEIGHBORHOOD", 6, PlaceTypes.NEIGHBORHOOD);
        NEIGHBORHOOD = ymeVar7;
        yme ymeVar8 = new yme("POSTAL_TOWN", 7, PlaceTypes.POSTAL_TOWN);
        POSTAL_TOWN = ymeVar8;
        yme ymeVar9 = new yme("POSTAL_CODE", 8, PlaceTypes.POSTAL_CODE);
        POSTAL_CODE = ymeVar9;
        yme ymeVar10 = new yme("PREMISE", 9, PlaceTypes.PREMISE);
        PREMISE = ymeVar10;
        yme ymeVar11 = new yme("ROUTE", 10, PlaceTypes.ROUTE);
        ROUTE = ymeVar11;
        yme ymeVar12 = new yme("STREET_NUMBER", 11, PlaceTypes.STREET_NUMBER);
        STREET_NUMBER = ymeVar12;
        yme ymeVar13 = new yme("SUBLOCALITY", 12, PlaceTypes.SUBLOCALITY);
        SUBLOCALITY = ymeVar13;
        yme ymeVar14 = new yme("SUBLOCALITY_LEVEL_1", 13, PlaceTypes.SUBLOCALITY_LEVEL_1);
        SUBLOCALITY_LEVEL_1 = ymeVar14;
        yme ymeVar15 = new yme("SUBLOCALITY_LEVEL_2", 14, PlaceTypes.SUBLOCALITY_LEVEL_2);
        SUBLOCALITY_LEVEL_2 = ymeVar15;
        yme ymeVar16 = new yme("SUBLOCALITY_LEVEL_3", 15, PlaceTypes.SUBLOCALITY_LEVEL_3);
        SUBLOCALITY_LEVEL_3 = ymeVar16;
        yme ymeVar17 = new yme("SUBLOCALITY_LEVEL_4", 16, PlaceTypes.SUBLOCALITY_LEVEL_4);
        SUBLOCALITY_LEVEL_4 = ymeVar17;
        yme[] ymeVarArr = {ymeVar, ymeVar2, ymeVar3, ymeVar4, ymeVar5, ymeVar6, ymeVar7, ymeVar8, ymeVar9, ymeVar10, ymeVar11, ymeVar12, ymeVar13, ymeVar14, ymeVar15, ymeVar16, ymeVar17};
        $VALUES = ymeVarArr;
        $ENTRIES = new wg7(ymeVarArr);
    }

    public yme(String str, int i, String str2) {
        this.value = str2;
    }

    public static yme valueOf(String str) {
        return (yme) Enum.valueOf(yme.class, str);
    }

    public static yme[] values() {
        return (yme[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
