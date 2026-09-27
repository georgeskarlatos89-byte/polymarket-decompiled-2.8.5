package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class pwn {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[0] = "propertyDescriptor";
            } else {
                objArr[0] = "memberDescriptor";
            }
        } else {
            objArr[0] = "companionObject";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                } else {
                    objArr[2] = "hasJvmFieldAnnotation";
                }
            } else {
                objArr[2] = "isMappedIntrinsicCompanionObject";
            }
        } else {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final float b(bne bneVar, boolean z, vc9[] vc9VarArr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (vc9 vc9Var : vc9VarArr) {
            float a = bneVar.a(vc9Var, Float.NaN);
            if (!Float.isNaN(f2)) {
                if (a > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = a;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }
}
