package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i6g {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Call.Factory b;
    public final HttpUrl c;
    public final List d;
    public final List e;
    public final Executor f;

    public i6g(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final ev2 a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            ev2 ev2Var = ((dv2) list.get(i)).get(type, annotationArr, this);
            if (ev2Var != null) {
                return ev2Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((dv2) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object b(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new g6g(this, cls));
        }
        dmk.v("API declarations must be interfaces.");
        return null;
    }

    public final n65 c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            n65 a = ((m65) list.get(i)).a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((m65) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final n65 d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            n65 b = ((m65) list.get(i)).b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((m65) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final n65 e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n65 c = ((m65) list.get(i)).c(type, annotationArr, this);
            if (c != null) {
                return c;
            }
        }
        return nim.d;
    }
}
