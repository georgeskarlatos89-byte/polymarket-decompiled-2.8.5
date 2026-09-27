package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.api.Keys;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class aym {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(ByteArrayOutputStream byteArrayOutputStream, sq6 sq6Var) {
        int i = 0;
        for (Map.Entry entry : sq6Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ti1.j(byteArrayOutputStream, intValue - i);
                ti1.j(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final Set a(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            jSONArray.getClass();
            for (int i : u(jSONArray)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return CollectionsKt.Q0(arrayList);
    }

    public static Type b(Type type) {
        if (Collection.class.isAssignableFrom(Collection.class)) {
            Type i = s1k.i(type, Collection.class, s1k.d(type, Collection.class, Collection.class), new LinkedHashSet());
            if (i instanceof WildcardType) {
                i = ((WildcardType) i).getUpperBounds()[0];
            }
            if (i instanceof ParameterizedType) {
                return ((ParameterizedType) i).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        omf.a();
        return null;
    }

    public static byte[] c(sq6[] sq6VarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (sq6 sq6Var : sq6VarArr) {
            i2 += ((((sq6Var.g * 2) + 7) & (-8)) / 8) + (sq6Var.e * 2) + e(sq6Var.a, sq6Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + sq6Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, bym.c)) {
            int length = sq6VarArr.length;
            while (i < length) {
                sq6 sq6Var2 = sq6VarArr[i];
                y(byteArrayOutputStream, sq6Var2, e(sq6Var2.a, sq6Var2.b, bArr));
                x(byteArrayOutputStream, sq6Var2);
                i++;
            }
        } else {
            for (sq6 sq6Var3 : sq6VarArr) {
                y(byteArrayOutputStream, sq6Var3, e(sq6Var3.a, sq6Var3.b, bArr));
            }
            int length2 = sq6VarArr.length;
            while (i < length2) {
                x(byteArrayOutputStream, sq6VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean d(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof l1k) {
                actualTypeArguments = ((l1k) parameterizedType).c;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof l1k) {
                actualTypeArguments2 = ((l1k) parameterizedType2).c;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            if (d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2)) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static String e(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = bym.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = bym.d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return woa.r(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static Class f(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        ahh.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
        return null;
    }

    public static final String g(JSONObject jSONObject) {
        if (jSONObject.has("error")) {
            String string = jSONObject.getString("error");
            string.getClass();
            return string;
        }
        return "";
    }

    public static Type[] h(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type i = s1k.i(type, cls, s1k.d(type, cls, Map.class), new LinkedHashSet());
            if (i instanceof ParameterizedType) {
                return ((ParameterizedType) i).getActualTypeArguments();
            }
            return new Type[]{Object.class, Object.class};
        }
        omf.a();
        return null;
    }

    public static l1k i(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new l1k(null, cls, typeArr);
        }
        dmk.v(ace.j(cls, "Missing type arguments for "));
        return null;
    }

    public static final JSONObject j(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final String k(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static int[] l(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) ti1.f(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static sq6[] m(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, sq6[] sq6VarArr) {
        byte[] bArr3 = bym.f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bym.a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int f = (int) ti1.f(fileInputStream, 1);
                    byte[] e = ti1.e(fileInputStream, (int) ti1.f(fileInputStream, 4), (int) ti1.f(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                        try {
                            sq6[] n = n(byteArrayInputStream, f, sq6VarArr);
                            byteArrayInputStream.close();
                            return n;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    dmk.n("Content found after the end of file");
                    return null;
                }
                dmk.n("Unsupported meta version");
                return null;
            }
            dmk.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, bym.g)) {
            int f2 = (int) ti1.f(fileInputStream, 2);
            byte[] e2 = ti1.e(fileInputStream, (int) ti1.f(fileInputStream, 4), (int) ti1.f(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(e2);
                try {
                    sq6[] o = o(byteArrayInputStream2, bArr2, f2, sq6VarArr);
                    byteArrayInputStream2.close();
                    return o;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            dmk.n("Content found after the end of file");
            return null;
        }
        dmk.n("Unsupported meta version");
        return null;
    }

    public static sq6[] n(ByteArrayInputStream byteArrayInputStream, int i, sq6[] sq6VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new sq6[0];
        }
        if (i == sq6VarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int f = (int) ti1.f(byteArrayInputStream, 2);
                iArr[i2] = (int) ti1.f(byteArrayInputStream, 2);
                strArr[i2] = new String(ti1.d(byteArrayInputStream, f), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                sq6 sq6Var = sq6VarArr[i3];
                if (sq6Var.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    sq6Var.e = i4;
                    sq6Var.h = l(byteArrayInputStream, i4);
                } else {
                    dmk.n("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return sq6VarArr;
        }
        dmk.n("Mismatched number of dex files found in metadata");
        return null;
    }

    public static sq6[] o(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, sq6[] sq6VarArr) {
        String str;
        sq6 sq6Var;
        if (byteArrayInputStream.available() == 0) {
            return new sq6[0];
        }
        if (i == sq6VarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                ti1.f(byteArrayInputStream, 2);
                String str2 = new String(ti1.d(byteArrayInputStream, (int) ti1.f(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long f = ti1.f(byteArrayInputStream, 4);
                int f2 = (int) ti1.f(byteArrayInputStream, 2);
                if (sq6VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i3 = 0; i3 < sq6VarArr.length; i3++) {
                        if (sq6VarArr[i3].b.equals(str)) {
                            sq6Var = sq6VarArr[i3];
                            break;
                        }
                    }
                }
                sq6Var = null;
                if (sq6Var != null) {
                    sq6Var.d = f;
                    int[] l = l(byteArrayInputStream, f2);
                    if (Arrays.equals(bArr, bym.e)) {
                        sq6Var.e = f2;
                        sq6Var.h = l;
                    }
                } else {
                    dmk.n("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return sq6VarArr;
        }
        dmk.n("Mismatched number of dex files found in metadata");
        return null;
    }

    public static sq6[] p(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, bym.b)) {
            int f = (int) ti1.f(fileInputStream, 1);
            byte[] e = ti1.e(fileInputStream, (int) ti1.f(fileInputStream, 4), (int) ti1.f(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    sq6[] q = q(byteArrayInputStream, str, f);
                    byteArrayInputStream.close();
                    return q;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dmk.n("Content found after the end of file");
            return null;
        }
        dmk.n("Unsupported version");
        return null;
    }

    public static sq6[] q(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2;
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new sq6[0];
        }
        sq6[] sq6VarArr = new sq6[i];
        for (int i4 = 0; i4 < i; i4++) {
            int f = (int) ti1.f(byteArrayInputStream, 2);
            int f2 = (int) ti1.f(byteArrayInputStream, 2);
            sq6VarArr[i4] = new sq6(str, new String(ti1.d(byteArrayInputStream, f), StandardCharsets.UTF_8), ti1.f(byteArrayInputStream, 4), f2, (int) ti1.f(byteArrayInputStream, 4), (int) ti1.f(byteArrayInputStream, 4), new int[f2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i) {
            sq6 sq6Var = sq6VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = sq6Var.f;
            int i7 = sq6Var.g;
            TreeMap treeMap = sq6Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) ti1.f(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int f3 = (int) ti1.f(byteArrayInputStream, 2);
                while (f3 > 0) {
                    ti1.f(byteArrayInputStream, 2);
                    int f4 = (int) ti1.f(byteArrayInputStream, 1);
                    if (f4 != 6 && f4 != 7) {
                        while (f4 > 0) {
                            ti1.f(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int f5 = (int) ti1.f(byteArrayInputStream, 1); f5 > 0; f5--) {
                                ti1.f(byteArrayInputStream, 2);
                            }
                            f4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    f3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() == i8) {
                sq6Var.h = l(byteArrayInputStream, sq6Var.e);
                BitSet valueOf = BitSet.valueOf(ti1.d(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
                for (int i14 = i12; i14 < i7; i14++) {
                    if (valueOf.get(i14)) {
                        i2 = 2;
                    } else {
                        i2 = i12;
                    }
                    if (valueOf.get(i14 + i7)) {
                        i2 |= 4;
                    }
                    if (i2 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                        if (num == null) {
                            num = Integer.valueOf(i12);
                        }
                        treeMap.put(Integer.valueOf(i14), Integer.valueOf(i2 | num.intValue()));
                    }
                }
                i5 = i13 + 1;
                i3 = i12;
            } else {
                dmk.n("Read too much data during profile line parse");
                return null;
            }
        }
        return sq6VarArr;
    }

    public static m1k r(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new m1k(typeArr, s1k.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u81] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yw0, java.lang.Object] */
    public static final u81 s(JSONObject jSONObject) {
        Long l;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Double d;
        Integer num;
        Double d2;
        Double d3;
        Double d4;
        Long l2;
        Long l3;
        String str;
        yw0 yw0Var;
        jSONObject.getClass();
        ?? obj = new Object();
        String string = jSONObject.getString("event_type");
        string.getClass();
        obj.L = string;
        obj.a = k(jSONObject, "user_id");
        obj.b = k(jSONObject, "device_id");
        av9 av9Var = null;
        if (jSONObject.has("time")) {
            l = Long.valueOf(jSONObject.getLong("time"));
        } else {
            l = null;
        }
        obj.c = l;
        JSONObject j = j(jSONObject, "event_properties");
        if (j != null) {
            linkedHashMap = new LinkedHashMap(vxm.g(j));
        } else {
            linkedHashMap = null;
        }
        obj.M = linkedHashMap;
        JSONObject j2 = j(jSONObject, "user_properties");
        if (j2 != null) {
            linkedHashMap2 = new LinkedHashMap(vxm.g(j2));
        } else {
            linkedHashMap2 = null;
        }
        obj.N = linkedHashMap2;
        JSONObject j3 = j(jSONObject, "groups");
        if (j3 != null) {
            linkedHashMap3 = new LinkedHashMap(vxm.g(j3));
        } else {
            linkedHashMap3 = null;
        }
        obj.O = linkedHashMap3;
        JSONObject j4 = j(jSONObject, "group_properties");
        if (j4 != null) {
            linkedHashMap4 = new LinkedHashMap(vxm.g(j4));
        } else {
            linkedHashMap4 = null;
        }
        obj.P = linkedHashMap4;
        obj.i = k(jSONObject, "app_version");
        obj.k = k(jSONObject, "platform");
        obj.l = k(jSONObject, "os_name");
        obj.m = k(jSONObject, "os_version");
        obj.n = k(jSONObject, "device_brand");
        obj.o = k(jSONObject, "device_manufacturer");
        obj.p = k(jSONObject, "device_model");
        obj.q = k(jSONObject, "carrier");
        obj.r = k(jSONObject, "country");
        obj.s = k(jSONObject, "region");
        obj.t = k(jSONObject, "city");
        obj.u = k(jSONObject, "dma");
        obj.A = k(jSONObject, Keys.KEY_LANGUAGE);
        if (jSONObject.has("price")) {
            d = Double.valueOf(jSONObject.getDouble("price"));
        } else {
            d = null;
        }
        obj.G = d;
        if (jSONObject.has("quantity")) {
            num = Integer.valueOf(jSONObject.getInt("quantity"));
        } else {
            num = null;
        }
        obj.H = num;
        if (jSONObject.has("revenue")) {
            d2 = Double.valueOf(jSONObject.getDouble("revenue"));
        } else {
            d2 = null;
        }
        obj.F = d2;
        obj.I = k(jSONObject, "productId");
        obj.J = k(jSONObject, "revenueType");
        if (jSONObject.has("location_lat")) {
            d3 = Double.valueOf(jSONObject.getDouble("location_lat"));
        } else {
            d3 = null;
        }
        obj.g = d3;
        if (jSONObject.has("location_lng")) {
            d4 = Double.valueOf(jSONObject.getDouble("location_lng"));
        } else {
            d4 = null;
        }
        obj.h = d4;
        obj.C = k(jSONObject, "ip");
        obj.v = k(jSONObject, "idfa");
        obj.w = k(jSONObject, "idfv");
        obj.x = k(jSONObject, "adid");
        obj.z = k(jSONObject, "android_id");
        obj.y = jSONObject.optString("android_app_set_id", null);
        if (jSONObject.has("event_id")) {
            l2 = Long.valueOf(jSONObject.getLong("event_id"));
        } else {
            l2 = null;
        }
        obj.d = l2;
        if (jSONObject.has(Keys.KEY_SESSION_ID)) {
            l3 = Long.valueOf(jSONObject.getLong(Keys.KEY_SESSION_ID));
        } else {
            l3 = null;
        }
        obj.e = l3;
        obj.f = k(jSONObject, "insert_id");
        if (jSONObject.has(PlaceTypes.LIBRARY)) {
            str = jSONObject.getString(PlaceTypes.LIBRARY);
        } else {
            str = null;
        }
        obj.B = str;
        obj.K = k(jSONObject, "partner_id");
        if (jSONObject.has("plan")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            jSONObject2.getClass();
            String optString = jSONObject2.optString("branch", null);
            String optString2 = jSONObject2.optString("source", null);
            String optString3 = jSONObject2.optString("version", null);
            String optString4 = jSONObject2.optString("versionId", null);
            ?? obj2 = new Object();
            obj2.a = optString;
            obj2.b = optString2;
            obj2.c = optString3;
            obj2.d = optString4;
            yw0Var = obj2;
        } else {
            yw0Var = null;
        }
        obj.D = yw0Var;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            jSONObject3.getClass();
            av9Var = new av9(jSONObject3.optString("source_name", null), jSONObject3.optString("source_version", null), 0);
        }
        obj.E = av9Var;
        return obj;
    }

    public static final ArrayList t(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = lnf.k(0, jSONArray.length()).iterator();
        while (((g1a) it).c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((y0a) it).nextInt());
            jSONObject.getClass();
            arrayList.add(s(jSONObject));
        }
        return arrayList;
    }

    public static final int[] u(JSONArray jSONArray) {
        jSONArray.getClass();
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        return iArr;
    }

    public static final ArrayList v(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = lnf.k(0, jSONArray.length()).iterator();
        while (((g1a) it).c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((y0a) it).nextInt());
            jSONObject.getClass();
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean w(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, sq6[] sq6VarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = bym.a;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ti1.j(byteArrayOutputStream2, sq6VarArr.length);
                int i2 = 2;
                int i3 = 2;
                for (sq6 sq6Var : sq6VarArr) {
                    ti1.i(byteArrayOutputStream2, sq6Var.c, 4);
                    ti1.i(byteArrayOutputStream2, sq6Var.d, 4);
                    ti1.i(byteArrayOutputStream2, sq6Var.g, 4);
                    String e = e(sq6Var.a, sq6Var.b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = e.getBytes(charset).length;
                    ti1.j(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(e.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    tpk tpkVar = new tpk(l08.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(tpkVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    for (int i5 = 0; i5 < sq6VarArr.length; i5++) {
                        try {
                            sq6 sq6Var2 = sq6VarArr[i5];
                            ti1.j(byteArrayOutputStream3, i5);
                            ti1.j(byteArrayOutputStream3, sq6Var2.e);
                            i4 = i4 + 4 + (sq6Var2.e * i2);
                            int[] iArr = sq6Var2.h;
                            int length3 = iArr.length;
                            int i6 = 0;
                            int i7 = 0;
                            while (i6 < length3) {
                                int i8 = iArr[i6];
                                ti1.j(byteArrayOutputStream3, i8 - i7);
                                i6++;
                                i2 = i2;
                                i7 = i8;
                            }
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i4 == byteArray2.length) {
                        tpk tpkVar2 = new tpk(l08.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(tpkVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < sq6VarArr.length) {
                            try {
                                sq6 sq6Var3 = sq6VarArr[i9];
                                Iterator it = sq6Var3.i.entrySet().iterator();
                                int i11 = i;
                                while (it.hasNext()) {
                                    i11 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    z(byteArrayOutputStream4, i11, sq6Var3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        A(byteArrayOutputStream4, sq6Var3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        ti1.j(byteArrayOutputStream3, i9);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i12 = i10 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        ti1.i(byteArrayOutputStream3, length4, 4);
                                        ti1.j(byteArrayOutputStream3, i11);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i10 = i12 + length4;
                                        i9++;
                                        arrayList3 = arrayList4;
                                        i = 0;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i10 == byteArray5.length) {
                            tpk tpkVar3 = new tpk(l08.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(tpkVar3);
                            long size = 12 + (arrayList2.size() * 16);
                            ti1.i(byteArrayOutputStream, arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                tpk tpkVar4 = (tpk) arrayList2.get(i13);
                                l08 l08Var = tpkVar4.a;
                                byte[] bArr3 = tpkVar4.b;
                                ti1.i(byteArrayOutputStream, l08Var.a(), 4);
                                ti1.i(byteArrayOutputStream, size, 4);
                                if (tpkVar4.c) {
                                    long length5 = bArr3.length;
                                    byte[] c = ti1.c(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(c);
                                    ti1.i(byteArrayOutputStream, c.length, 4);
                                    ti1.i(byteArrayOutputStream, length5, 4);
                                    length = c.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    ti1.i(byteArrayOutputStream, bArr3.length, 4);
                                    ti1.i(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i13++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i14));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = bym.b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] c2 = c(sq6VarArr, bArr4);
            ti1.i(byteArrayOutputStream, sq6VarArr.length, 1);
            ti1.i(byteArrayOutputStream, c2.length, 4);
            byte[] c3 = ti1.c(c2);
            ti1.i(byteArrayOutputStream, c3.length, 4);
            byteArrayOutputStream.write(c3);
            return true;
        }
        byte[] bArr5 = bym.d;
        if (Arrays.equals(bArr, bArr5)) {
            ti1.i(byteArrayOutputStream, sq6VarArr.length, 1);
            for (sq6 sq6Var4 : sq6VarArr) {
                int size2 = sq6Var4.i.size() * 4;
                String e2 = e(sq6Var4.a, sq6Var4.b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                ti1.j(byteArrayOutputStream, e2.getBytes(charset2).length);
                ti1.j(byteArrayOutputStream, sq6Var4.h.length);
                ti1.i(byteArrayOutputStream, size2, 4);
                ti1.i(byteArrayOutputStream, sq6Var4.c, 4);
                byteArrayOutputStream.write(e2.getBytes(charset2));
                Iterator it2 = sq6Var4.i.keySet().iterator();
                while (it2.hasNext()) {
                    ti1.j(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    ti1.j(byteArrayOutputStream, 0);
                }
                for (int i15 : sq6Var4.h) {
                    ti1.j(byteArrayOutputStream, i15);
                }
            }
            return true;
        }
        byte[] bArr6 = bym.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] c4 = c(sq6VarArr, bArr6);
            ti1.i(byteArrayOutputStream, sq6VarArr.length, 1);
            ti1.i(byteArrayOutputStream, c4.length, 4);
            byte[] c5 = ti1.c(c4);
            ti1.i(byteArrayOutputStream, c5.length, 4);
            byteArrayOutputStream.write(c5);
            return true;
        }
        byte[] bArr7 = bym.e;
        if (Arrays.equals(bArr, bArr7)) {
            ti1.j(byteArrayOutputStream, sq6VarArr.length);
            for (sq6 sq6Var5 : sq6VarArr) {
                String str = sq6Var5.a;
                TreeMap treeMap = sq6Var5.i;
                String e3 = e(str, sq6Var5.b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                ti1.j(byteArrayOutputStream, e3.getBytes(charset3).length);
                ti1.j(byteArrayOutputStream, treeMap.size());
                ti1.j(byteArrayOutputStream, sq6Var5.h.length);
                ti1.i(byteArrayOutputStream, sq6Var5.c, 4);
                byteArrayOutputStream.write(e3.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    ti1.j(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i16 : sq6Var5.h) {
                    ti1.j(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        return false;
    }

    public static void x(ByteArrayOutputStream byteArrayOutputStream, sq6 sq6Var) {
        A(byteArrayOutputStream, sq6Var);
        int i = sq6Var.g;
        int[] iArr = sq6Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            ti1.j(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : sq6Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void y(ByteArrayOutputStream byteArrayOutputStream, sq6 sq6Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        ti1.j(byteArrayOutputStream, str.getBytes(charset).length);
        ti1.j(byteArrayOutputStream, sq6Var.e);
        ti1.i(byteArrayOutputStream, sq6Var.f, 4);
        ti1.i(byteArrayOutputStream, sq6Var.c, 4);
        ti1.i(byteArrayOutputStream, sq6Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, int i, sq6 sq6Var) {
        int i2 = sq6Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : sq6Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }
}
