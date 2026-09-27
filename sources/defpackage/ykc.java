package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ykc {
    public int a;
    public final ArrayList b;

    public ykc(int i) {
        switch (i) {
            case 1:
                this.b = new ArrayList();
                return;
            default:
                this.b = new ArrayList();
                this.a = 0;
                return;
        }
    }

    public void a(cda cdaVar) {
        if (cdaVar != null) {
            int i = this.a;
            this.a = i + 1;
            this.b.add(i, cdaVar);
            return;
        }
        dmk.v("factory == null");
    }

    public void b(Class cls, JsonAdapter jsonAdapter) {
        ArrayList arrayList = blc.e;
        a(new ub(cls, jsonAdapter, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Object obj) {
        Class<?> cls;
        Object obj2;
        Object obj3;
        Type type;
        ?? r2;
        Object obj4;
        String str;
        Class cls2;
        int i;
        int i2;
        Object obj5;
        String str2;
        Set set;
        Class cls3;
        tb tbVar;
        tb b;
        boolean z;
        String str3;
        Object obj6;
        tb tbVar2;
        boolean z2;
        tb b2;
        boolean z3;
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> cls4 = obj.getClass();
            while (cls4 != Object.class) {
                Method[] declaredMethods = cls4.getDeclaredMethods();
                int length = declaredMethods.length;
                int i3 = 0;
                Object[] objArr = declaredMethods;
                while (i3 < length) {
                    Method method = objArr[i3];
                    boolean isAnnotationPresent = method.isAnnotationPresent(x3j.class);
                    Class cls5 = Void.TYPE;
                    if (isAnnotationPresent) {
                        method.setAccessible(true);
                        Type genericReturnType = method.getGenericReturnType();
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        i = 0;
                        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == wga.class && genericReturnType == cls5) {
                            int length2 = genericParameterTypes.length;
                            int i4 = 2;
                            Object obj7 = objArr;
                            while (i4 < length2) {
                                cls = cls4;
                                Type type2 = genericParameterTypes[i4];
                                obj2 = obj7;
                                if ((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == JsonAdapter.class) {
                                    i4++;
                                    cls4 = cls;
                                    obj7 = obj2;
                                }
                            }
                            cls = cls4;
                            obj2 = obj7;
                            obj3 = "Nullable";
                            obj6 = "\n    ";
                            str3 = "Unexpected signature for ";
                            type = JsonAdapter.class;
                            z2 = true;
                            tbVar2 = new rb(genericParameterTypes[1], s1k.f(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true, 0);
                            cls2 = cls5;
                            b2 = ub.b(arrayList, tbVar2.a, tbVar2.b);
                            if (b2 != null) {
                                arrayList.add(tbVar2);
                                obj4 = obj6;
                                str = str3;
                                r2 = z2;
                            } else {
                                StringBuilder sb = new StringBuilder("Conflicting @ToJson methods:\n    ");
                                sb.append(b2.d);
                                ahh.n(sb, obj6, tbVar2.d);
                                return;
                            }
                        } else {
                            cls = cls4;
                            obj2 = objArr;
                        }
                        obj3 = "Nullable";
                        type = JsonAdapter.class;
                        obj6 = "\n    ";
                        str3 = "Unexpected signature for ";
                        z2 = true;
                        if (genericParameterTypes.length == 1 && genericReturnType != cls5) {
                            Set set2 = s1k.a;
                            Set f = s1k.f(method.getAnnotations());
                            Set f2 = s1k.f(parameterAnnotations[0]);
                            Annotation[] annotationArr = parameterAnnotations[0];
                            int length3 = annotationArr.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length3) {
                                    if (annotationArr[i5].annotationType().getSimpleName().equals(obj3)) {
                                        z3 = true;
                                        break;
                                    }
                                    i5++;
                                } else {
                                    z3 = false;
                                    break;
                                }
                            }
                            cls2 = cls5;
                            tbVar2 = new sb(genericParameterTypes[0], f2, obj, method, genericParameterTypes.length, z3, genericParameterTypes, genericReturnType, f2, f, 0);
                            b2 = ub.b(arrayList, tbVar2.a, tbVar2.b);
                            if (b2 != null) {
                            }
                        } else {
                            fi9.p(method, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n", str3);
                            return;
                        }
                    } else {
                        cls = cls4;
                        obj2 = objArr;
                        obj3 = "Nullable";
                        type = JsonAdapter.class;
                        r2 = 1;
                        obj4 = "\n    ";
                        str = "Unexpected signature for ";
                        cls2 = cls5;
                        i = 0;
                    }
                    if (method.isAnnotationPresent(dp8.class)) {
                        method.setAccessible(r2);
                        String str4 = str;
                        Type genericReturnType2 = method.getGenericReturnType();
                        Set set3 = s1k.a;
                        Set f3 = s1k.f(method.getAnnotations());
                        Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        if (genericParameterTypes2.length >= r2 && genericParameterTypes2[i] == JsonReader.class) {
                            cls3 = cls2;
                            if (genericReturnType2 != cls3) {
                                int length4 = genericParameterTypes2.length;
                                int i6 = r2;
                                while (i6 < length4) {
                                    int i7 = i6;
                                    Type type3 = genericParameterTypes2[i7];
                                    i2 = length;
                                    if ((type3 instanceof ParameterizedType) && ((ParameterizedType) type3).getRawType() == type) {
                                        length = i2;
                                        i6 = i7 + 1;
                                    }
                                }
                                i2 = length;
                                obj5 = obj4;
                                tbVar = new rb(genericReturnType2, f3, obj, method, genericParameterTypes2.length, 1, true, 1);
                                b = ub.b(arrayList2, tbVar.a, tbVar.b);
                                if (b != null) {
                                    arrayList2.add(tbVar);
                                } else {
                                    StringBuilder sb2 = new StringBuilder("Conflicting @FromJson methods:\n    ");
                                    sb2.append(b.d);
                                    ahh.n(sb2, obj5, tbVar.d);
                                    return;
                                }
                            } else {
                                i2 = length;
                            }
                            obj5 = obj4;
                            str2 = str4;
                            set = f3;
                        } else {
                            i2 = length;
                            obj5 = obj4;
                            str2 = str4;
                            set = f3;
                            cls3 = cls2;
                        }
                        if (genericParameterTypes2.length == 1 && genericReturnType2 != cls3) {
                            Set f4 = s1k.f(parameterAnnotations2[i]);
                            Annotation[] annotationArr2 = parameterAnnotations2[i];
                            int length5 = annotationArr2.length;
                            int i8 = i;
                            while (true) {
                                if (i8 < length5) {
                                    if (annotationArr2[i8].annotationType().getSimpleName().equals(obj3)) {
                                        z = 1;
                                        break;
                                    }
                                    i8++;
                                } else {
                                    z = i;
                                    break;
                                }
                            }
                            tbVar = new sb(genericReturnType2, set, obj, method, genericParameterTypes2.length, z, genericParameterTypes2, genericReturnType2, f4, set, 1);
                            b = ub.b(arrayList2, tbVar.a, tbVar.b);
                            if (b != null) {
                            }
                        } else {
                            fi9.p(method, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n", str2);
                            return;
                        }
                    } else {
                        i2 = length;
                    }
                    i3++;
                    cls4 = cls;
                    objArr = obj2;
                    length = i2;
                }
                cls4 = cls4.getSuperclass();
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                dmk.v("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
                return;
            } else {
                a(new ub(arrayList, arrayList2, 0));
                return;
            }
        }
        dmk.v("adapter == null");
    }

    public void d(Collection collection) {
        collection.getClass();
        this.b.addAll(collection);
    }
}
