package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.NeutralFilterObject;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class rhl {
    public static final vl4 a = new vl4(new lm4(9), false, -550088329);

    public static final Object c(Object obj) {
        if (obj instanceof Double) {
            Number number = (Number) obj;
            if (number.doubleValue() == ((long) number.doubleValue())) {
                long doubleValue = (long) number.doubleValue();
                if (-2147483648L <= doubleValue && doubleValue <= 2147483647L) {
                    return Integer.valueOf((int) doubleValue);
                }
                return Long.valueOf(doubleValue);
            }
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(iterable));
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    obj2 = c(obj2);
                }
                arrayList.add(obj2);
            }
            return arrayList;
        }
        return obj;
    }

    public static final FilterObject d(Map map, LinkedHashSet linkedHashSet) {
        Collection collection;
        if (map.isEmpty()) {
            return NeutralFilterObject.INSTANCE;
        }
        if (map.size() == 2 && map.containsKey("distinct") && map.containsKey("members")) {
            Object obj = map.get("members");
            if (obj instanceof Collection) {
                collection = (Collection) obj;
            } else {
                collection = null;
            }
            if (collection != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collection) {
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    }
                }
                return Filters.distinct(arrayList);
            }
        } else {
            if (map.size() == 1) {
                Map.Entry entry = (Map.Entry) CollectionsKt.D(map.entrySet());
                return f((String) entry.getKey(), entry.getValue(), linkedHashSet);
            }
            Set<Map.Entry> entrySet = map.entrySet();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : entrySet) {
                FilterObject f = f((String) entry2.getKey(), entry2.getValue(), linkedHashSet);
                if (f != null) {
                    arrayList2.add(f);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() == 1) {
                    return (FilterObject) CollectionsKt.E(arrayList2);
                }
                FilterObject[] filterObjectArr = (FilterObject[]) arrayList2.toArray(new FilterObject[0]);
                return Filters.and((FilterObject[]) Arrays.copyOf(filterObjectArr, filterObjectArr.length));
            }
        }
        return null;
    }

    public static final FilterObject e(Object obj, LinkedHashSet linkedHashSet, Function1 function1) {
        List list;
        Map map;
        FilterObject filterObject;
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Map) {
                    map = (Map) obj2;
                } else {
                    map = null;
                }
                if (map != null) {
                    filterObject = d(map, linkedHashSet);
                } else {
                    filterObject = null;
                }
                if (filterObject != null) {
                    arrayList.add(filterObject);
                }
            }
            if (!arrayList.isEmpty()) {
                return (FilterObject) function1.invoke(arrayList.toArray(new FilterObject[0]));
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final FilterObject f(String str, Object obj, LinkedHashSet linkedHashSet) {
        Collection collection;
        Collection collection2;
        Boolean bool;
        String str2;
        int hashCode = str.hashCode();
        if (hashCode != 38151) {
            if (hashCode != 1169203) {
                if (hashCode == 1181741 && str.equals("$nor")) {
                    return e(obj, linkedHashSet, new ex7(16));
                }
            } else if (str.equals("$and")) {
                return e(obj, linkedHashSet, new ex7(14));
            }
        } else if (str.equals("$or")) {
            return e(obj, linkedHashSet, new ex7(15));
        }
        linkedHashSet.add(str);
        if (!(obj instanceof Map)) {
            return Filters.eq(str, c(obj));
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Map.Entry entry = (Map.Entry) CollectionsKt.D(map.entrySet());
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            switch (str3.hashCode()) {
                case -1211297213:
                    if (str3.equals("$contains")) {
                        return Filters.contains(str, c(value));
                    }
                    break;
                case 37840:
                    if (str3.equals("$eq")) {
                        return Filters.eq(str, c(value));
                    }
                    break;
                case 37905:
                    if (str3.equals("$gt")) {
                        return Filters.greaterThan(str, c(value));
                    }
                    break;
                case 37961:
                    if (str3.equals("$in")) {
                        if (value instanceof Collection) {
                            collection = (Collection) value;
                        } else {
                            collection = null;
                        }
                        if (collection != null) {
                            Collection collection3 = collection;
                            ArrayList arrayList = new ArrayList(CollectionsKt.w(collection3));
                            for (Object obj2 : collection3) {
                                if (obj2 == null) {
                                    break;
                                } else {
                                    arrayList.add(c(obj2));
                                }
                            }
                            return Filters.in(str, arrayList);
                        }
                    }
                    break;
                case 38060:
                    if (str3.equals("$lt")) {
                        return Filters.lessThan(str, c(value));
                    }
                    break;
                case 38107:
                    if (str3.equals("$ne")) {
                        return Filters.ne(str, c(value));
                    }
                    break;
                case 1175156:
                    if (str3.equals("$gte")) {
                        return Filters.greaterThanEquals(str, c(value));
                    }
                    break;
                case 1179961:
                    if (str3.equals("$lte")) {
                        return Filters.lessThanEquals(str, c(value));
                    }
                    break;
                case 1181551:
                    if (str3.equals("$nin")) {
                        if (value instanceof Collection) {
                            collection2 = (Collection) value;
                        } else {
                            collection2 = null;
                        }
                        if (collection2 != null) {
                            Collection collection4 = collection2;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(collection4));
                            for (Object obj3 : collection4) {
                                if (obj3 == null) {
                                    break;
                                } else {
                                    arrayList2.add(c(obj3));
                                }
                            }
                            return Filters.nin(str, arrayList2);
                        }
                    }
                    break;
                case 596003200:
                    if (str3.equals("$exists")) {
                        if (value instanceof Boolean) {
                            bool = (Boolean) value;
                        } else {
                            bool = null;
                        }
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            return Filters.exists(str);
                        }
                        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                            return Filters.notExists(str);
                        }
                        if (bool != null) {
                            dmk.a();
                            return null;
                        }
                    }
                    break;
                case 1484446220:
                    if (str3.equals("$autocomplete")) {
                        if (value instanceof String) {
                            str2 = (String) value;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            return Filters.autocomplete(str, str2);
                        }
                    }
                    break;
            }
        }
        return null;
    }

    public bfc a(gfc gfcVar) {
        boolean z;
        ByteBuffer byteBuffer = gfcVar.e;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        return b(gfcVar, byteBuffer);
    }

    public abstract bfc b(gfc gfcVar, ByteBuffer byteBuffer);
}
