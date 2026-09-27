package io.ably.lib.types;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class Param {
    public String key;
    public String value;

    public Param(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public static Param[] array(Param param) {
        return new Param[]{param};
    }

    public static boolean containsKey(Param[] paramArr, String str) {
        if (getFirst(paramArr, str) != null) {
            return true;
        }
        return false;
    }

    public static String getFirst(Param[] paramArr, String str) {
        if (paramArr == null) {
            return null;
        }
        for (Param param : paramArr) {
            if (param.key.equals(str)) {
                return param.value;
            }
        }
        return null;
    }

    public static Param[] push(Param[] paramArr, Param param) {
        if (paramArr == null) {
            return new Param[]{param};
        }
        int length = paramArr.length;
        Param[] paramArr2 = new Param[length + 1];
        System.arraycopy(paramArr, 0, paramArr2, 0, length);
        paramArr2[length] = param;
        return paramArr2;
    }

    public static Param[] set(Param[] paramArr, Param param) {
        if (paramArr == null) {
            return new Param[]{param};
        }
        for (int i = 0; i < paramArr.length; i++) {
            if (paramArr[i].key.equals(param.key)) {
                paramArr[i] = param;
                return paramArr;
            }
        }
        return push(paramArr, param);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Param param = (Param) obj;
            String str = this.key;
            String str2 = param.key;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.value;
            String str4 = param.value;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.key;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return this.key + ":" + this.value;
    }

    public Param(String str, Object obj) {
        this(str, obj.toString());
    }

    public static Param[] push(Param[] paramArr, String str, String str2) {
        return push(paramArr, new Param(str, str2));
    }

    public static Param[] set(Param[] paramArr, String str, String str2) {
        return set(paramArr, new Param(str, str2));
    }
}
