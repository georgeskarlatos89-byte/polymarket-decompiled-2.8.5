package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sga implements efd, o3k {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final dfd e;
    public final boolean f;

    public sga(Writer writer, Map map, Map map2, dfd dfdVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = dfdVar;
        this.f = z;
    }

    public final sga a(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                c();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    jsonWriter.value(r6[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    c();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    a(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    a(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    b(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        dfd dfdVar = (dfd) this.c.get(obj.getClass());
        if (dfdVar != null) {
            jsonWriter.beginObject();
            dfdVar.encode(obj, this);
            jsonWriter.endObject();
            return this;
        }
        n3k n3kVar = (n3k) this.d.get(obj.getClass());
        if (n3kVar != null) {
            n3kVar.encode(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            c();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.e.encode(obj, this);
        jsonWriter.endObject();
        return this;
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, int i) {
        String str = gy7Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    public final sga b(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        dmk.n("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, long j) {
        String str = gy7Var.a;
        c();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.efd
    public final efd add(gy7 gy7Var, Object obj) {
        b(obj, gy7Var.a);
        return this;
    }

    @Override // defpackage.o3k
    public final o3k add(String str) {
        c();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.o3k
    public final o3k add(boolean z) {
        c();
        this.b.value(z);
        return this;
    }
}
