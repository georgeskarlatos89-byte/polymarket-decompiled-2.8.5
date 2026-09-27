package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ejk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ejk[] $VALUES;
    public static final djk Companion;
    public static final ejk FRIDAY;
    public static final ejk MONDAY;
    public static final ejk SATURDAY;
    public static final ejk SUNDAY;
    public static final ejk THURSDAY;
    public static final ejk TUESDAY;
    public static final ejk WEDNESDAY;
    private final String value;

    /* JADX WARN: Type inference failed for: r0v2, types: [djk, java.lang.Object] */
    static {
        ejk ejkVar = new ejk("MONDAY", 0, "Mon");
        MONDAY = ejkVar;
        ejk ejkVar2 = new ejk("TUESDAY", 1, "Tue");
        TUESDAY = ejkVar2;
        ejk ejkVar3 = new ejk("WEDNESDAY", 2, "Wed");
        WEDNESDAY = ejkVar3;
        ejk ejkVar4 = new ejk("THURSDAY", 3, "Thu");
        THURSDAY = ejkVar4;
        ejk ejkVar5 = new ejk("FRIDAY", 4, "Fri");
        FRIDAY = ejkVar5;
        ejk ejkVar6 = new ejk("SATURDAY", 5, "Sat");
        SATURDAY = ejkVar6;
        ejk ejkVar7 = new ejk("SUNDAY", 6, "Sun");
        SUNDAY = ejkVar7;
        ejk[] ejkVarArr = {ejkVar, ejkVar2, ejkVar3, ejkVar4, ejkVar5, ejkVar6, ejkVar7};
        $VALUES = ejkVarArr;
        $ENTRIES = new wg7(ejkVarArr);
        Companion = new Object();
    }

    public ejk(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static ejk valueOf(String str) {
        return (ejk) Enum.valueOf(ejk.class, str);
    }

    public static ejk[] values() {
        return (ejk[]) $VALUES.clone();
    }
}
