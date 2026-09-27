package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c6f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c6f[] $VALUES;
    public static final c6f BOOLEAN;
    public static final c6f BYTE;
    public static final c6f CHAR;
    public static final b6f Companion;
    public static final c6f DOUBLE;
    public static final c6f FLOAT;
    public static final c6f INT;
    public static final c6f LONG;
    public static final Set<c6f> NUMBER_TYPES;
    public static final c6f SHORT;
    private final Lazy arrayTypeFqName$delegate;
    private final csc arrayTypeName;
    private final Lazy typeFqName$delegate;
    private final csc typeName;

    /* JADX WARN: Type inference failed for: r0v2, types: [b6f, java.lang.Object] */
    static {
        c6f c6fVar = new c6f("BOOLEAN", 0, "Boolean");
        BOOLEAN = c6fVar;
        c6f c6fVar2 = new c6f("CHAR", 1, "Char");
        CHAR = c6fVar2;
        c6f c6fVar3 = new c6f("BYTE", 2, "Byte");
        BYTE = c6fVar3;
        c6f c6fVar4 = new c6f("SHORT", 3, "Short");
        SHORT = c6fVar4;
        c6f c6fVar5 = new c6f("INT", 4, "Int");
        INT = c6fVar5;
        c6f c6fVar6 = new c6f("FLOAT", 5, "Float");
        FLOAT = c6fVar6;
        c6f c6fVar7 = new c6f("LONG", 6, "Long");
        LONG = c6fVar7;
        c6f c6fVar8 = new c6f("DOUBLE", 7, "Double");
        DOUBLE = c6fVar8;
        c6f[] c6fVarArr = {c6fVar, c6fVar2, c6fVar3, c6fVar4, c6fVar5, c6fVar6, c6fVar7, c6fVar8};
        $VALUES = c6fVarArr;
        $ENTRIES = new wg7(c6fVarArr);
        Companion = new Object();
        NUMBER_TYPES = ArraysKt.l0(new c6f[]{c6fVar2, c6fVar3, c6fVar4, c6fVar5, c6fVar6, c6fVar7, c6fVar8});
    }

    public c6f(String str, int i, String str2) {
        this.typeName = csc.e(str2);
        this.arrayTypeName = csc.e(str2.concat("Array"));
        w4b w4bVar = w4b.PUBLICATION;
        this.typeFqName$delegate = LazyKt.a(w4bVar, new a6f(this, 0));
        this.arrayTypeFqName$delegate = LazyKt.a(w4bVar, new a6f(this, 1));
    }

    public static final xl8 a(c6f c6fVar) {
        return gvh.l.a(c6fVar.arrayTypeName);
    }

    public static final xl8 f(c6f c6fVar) {
        return gvh.l.a(c6fVar.typeName);
    }

    public static c6f valueOf(String str) {
        return (c6f) Enum.valueOf(c6f.class, str);
    }

    public static c6f[] values() {
        return (c6f[]) $VALUES.clone();
    }

    public final xl8 b() {
        return (xl8) this.arrayTypeFqName$delegate.getValue();
    }

    public final csc c() {
        return this.arrayTypeName;
    }

    public final xl8 d() {
        return (xl8) this.typeFqName$delegate.getValue();
    }

    public final csc e() {
        return this.typeName;
    }
}
