package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ob {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ob) {
                ob obVar = (ob) obj;
                int i = this.a;
                if (i == obVar.a) {
                    if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != obVar.b || this.b != obVar.d) {
                        if (this.d == obVar.d && this.b == obVar.b) {
                            Object obj2 = this.c;
                            Object obj3 = obVar.c;
                            if (obj2 != null) {
                                if (!obj2.equals(obj3)) {
                                    return false;
                                }
                            } else if (obj3 != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        return ix2.o(sb, this.c, "]");
    }
}
