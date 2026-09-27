package defpackage;

import com.socure.docv.capturesdk.api.Keys;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class csc implements Comparable {
    public final String a;
    public final boolean b;

    public csc(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            objArr[0] = Keys.KEY_NAME;
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                } else {
                    objArr[1] = "asStringStripSpecialMarkers";
                }
            } else {
                objArr[1] = "getIdentifier";
            }
        } else {
            objArr[1] = "asString";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static csc d(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return g(str);
            }
            return e(str);
        }
        a(9);
        throw null;
    }

    public static csc e(String str) {
        if (str != null) {
            return new csc(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith("<")) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        a(6);
        throw null;
    }

    public static csc g(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return new csc(str, true);
            }
            dmk.v("special name must start with '<': ".concat(str));
            return null;
        }
        a(8);
        throw null;
    }

    public final String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (!this.b) {
            String b = b();
            if (b != null) {
                return b;
            }
            a(2);
            throw null;
        }
        fi9.q(this, "not identifier: ");
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((csc) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof csc) {
                csc cscVar = (csc) obj;
                if (this.b != cscVar.b || !this.a.equals(cscVar.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        return this.a;
    }
}
