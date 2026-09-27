package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class msa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ msa[] $VALUES;
    public static final msa CLASS;
    public static final lsa Companion;
    public static final msa FILE_FACADE;
    public static final msa MULTIFILE_CLASS;
    public static final msa MULTIFILE_CLASS_PART;
    public static final msa SYNTHETIC_CLASS;
    public static final msa UNKNOWN;
    private static final Map<Integer, msa> entryById;
    private final int id;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lsa] */
    static {
        msa msaVar = new msa("UNKNOWN", 0, 0);
        UNKNOWN = msaVar;
        msa msaVar2 = new msa("CLASS", 1, 1);
        CLASS = msaVar2;
        msa msaVar3 = new msa("FILE_FACADE", 2, 2);
        FILE_FACADE = msaVar3;
        msa msaVar4 = new msa("SYNTHETIC_CLASS", 3, 3);
        SYNTHETIC_CLASS = msaVar4;
        msa msaVar5 = new msa("MULTIFILE_CLASS", 4, 4);
        MULTIFILE_CLASS = msaVar5;
        msa msaVar6 = new msa("MULTIFILE_CLASS_PART", 5, 5);
        MULTIFILE_CLASS_PART = msaVar6;
        msa[] msaVarArr = {msaVar, msaVar2, msaVar3, msaVar4, msaVar5, msaVar6};
        $VALUES = msaVarArr;
        $ENTRIES = new wg7(msaVarArr);
        Companion = new Object();
        msa[] values = values();
        int a = c1c.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        for (msa msaVar7 : values) {
            linkedHashMap.put(Integer.valueOf(msaVar7.id), msaVar7);
        }
        entryById = linkedHashMap;
    }

    public msa(String str, int i, int i2) {
        this.id = i2;
    }

    public static final /* synthetic */ Map a() {
        return entryById;
    }

    public static msa valueOf(String str) {
        return (msa) Enum.valueOf(msa.class, str);
    }

    public static msa[] values() {
        return (msa[]) $VALUES.clone();
    }
}
