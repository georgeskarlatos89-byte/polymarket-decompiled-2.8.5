package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wod {
    public static final wod c = new wod(vod.OVERRIDABLE, "SUCCESS");
    public final vod a;
    public final String b;

    public wod(vod vodVar, String str) {
        if (vodVar != null) {
            this.a = vodVar;
            this.b = str;
        } else {
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        String format;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
            } else {
                objArr[0] = "success";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i == 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "conflict";
                }
            } else {
                objArr[2] = "incompatible";
            }
            format = String.format(str, objArr);
            if (i != 1 || i == 2 || i == 3 || i == 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "debugMessage";
        switch (i) {
        }
        if (i == 1) {
        }
        format = String.format(str, objArr);
        if (i != 1) {
        }
        throw new IllegalArgumentException(format);
    }

    public static wod c(String str) {
        return new wod(vod.INCOMPATIBLE, str);
    }

    public final vod b() {
        vod vodVar = this.a;
        if (vodVar != null) {
            return vodVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a + ": " + this.b;
    }
}
