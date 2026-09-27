package defpackage;

import io.sentry.android.core.m0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bo5 {
    public static final String b = dm0.j("Data");
    public static final bo5 c;
    public final HashMap a;

    static {
        bo5 bo5Var = new bo5(new HashMap());
        c(bo5Var);
        c = bo5Var;
    }

    public bo5(bo5 bo5Var) {
        this.a = new HashMap(bo5Var.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bo5 a(byte[] bArr) {
        Throwable e;
        ObjectInputStream objectInputStream;
        String str = b;
        ObjectInputStream objectInputStream2 = null;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                    } catch (IOException | ClassNotFoundException e2) {
                        e = e2;
                        m0.e(str, "Error in Data#fromByteArray: ", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e3) {
                            m0.e(str, "Error in Data#fromByteArray: ", e3);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        m0.e(str, "Error in Data#fromByteArray: ", e4);
                        throw th;
                    }
                }
            } catch (IOException | ClassNotFoundException e5) {
                e = e5;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream2 != null) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e6) {
                m0.e(str, "Error in Data#fromByteArray: ", e6);
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e7) {
                m0.e(str, "Error in Data#fromByteArray: ", e7);
            }
            return new bo5(hashMap);
        }
        dmk.n("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    }

    public static byte[] c(bo5 bo5Var) {
        ObjectOutputStream objectOutputStream;
        String str = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(bo5Var.a.size());
            for (Map.Entry entry : bo5Var.a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                m0.e(str, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                m0.e(str, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            dmk.n("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            m0.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    m0.e(str, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                m0.e(str, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    m0.e(str, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                m0.e(str, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && bo5.class == obj.getClass()) {
                HashMap hashMap = ((bo5) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (keySet.equals(hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                            } else {
                                z = obj2.equals(obj3);
                            }
                        } else if (obj2 == obj3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public bo5(HashMap hashMap) {
        this.a = new HashMap(hashMap);
    }
}
