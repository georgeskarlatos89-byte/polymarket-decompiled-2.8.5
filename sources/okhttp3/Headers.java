package okhttp3;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.f27;
import defpackage.hm6;
import defpackage.n1i;
import defpackage.xja;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.DateFormattingKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 *2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002)*B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0007J\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0014J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0012J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001b\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001eH\u0096\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u0012H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016J\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0(R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006+"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "<init>", "([Ljava/lang/String;)V", "getNamesAndValues$okhttp", "()[Ljava/lang/String;", "[Ljava/lang/String;", "get", Keys.KEY_NAME, "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "size", "", "()I", "-deprecated_size", "index", "value", "names", "", "values", "", "byteCount", "", "iterator", "", "newBuilder", "Lokhttp3/Headers$Builder;", "equals", "", "other", "", "hashCode", "toString", "toMultimap", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, xja {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Headers EMPTY = new Headers(new String[0]);
    private final String[] namesAndValues;

    public Headers(String[] strArr) {
        strArr.getClass();
        this.namesAndValues = strArr;
    }

    public static final Headers of(Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @hm6
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m943deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return _HeadersCommonKt.commonEquals(this, other);
    }

    public final String get(String name) {
        name.getClass();
        return _HeadersCommonKt.commonHeadersGet(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        name.getClass();
        String str = get(name);
        if (str != null) {
            return DateFormattingKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        name.getClass();
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    /* renamed from: getNamesAndValues$okhttp, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    public int hashCode() {
        return _HeadersCommonKt.commonHashCode(this);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return _HeadersCommonKt.commonIterator(this);
    }

    public final String name(int index) {
        return _HeadersCommonKt.commonName(this, index);
    }

    public final Set<String> names() {
        n1i.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        return _HeadersCommonKt.commonNewBuilder(this);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        n1i.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = name.toLowerCase(locale);
            lowerCase.getClass();
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        return _HeadersCommonKt.commonToString(this);
    }

    public final String value(int index) {
        return _HeadersCommonKt.commonValue(this, index);
    }

    public final List<String> values(String name) {
        name.getClass();
        return _HeadersCommonKt.commonValues(this, name);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\nJ!\u0010\n\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\fR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "EMPTY", "Lokhttp3/Headers;", "headersOf", "namesAndValues", "", "", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "toHeaders", "", "headers", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @hm6
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m945deprecated_of(String... namesAndValues) {
            namesAndValues.getClass();
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            namesAndValues.getClass();
            return _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private Companion() {
        }

        @hm6
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m944deprecated_of(Map<String, String> headers) {
            headers.getClass();
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            map.getClass();
            return _HeadersCommonKt.commonToHeaders(map);
        }
    }

    public static final Headers of(String... strArr) {
        return INSTANCE.of(strArr);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0007J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\u0002J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0087\u0002J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002J\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "addLenient", "line", "addLenient$okhttp", "add", Keys.KEY_NAME, "value", "addUnsafeNonAscii", "addAll", "headers", "Lokhttp3/Headers;", "Ljava/util/Date;", "Ljava/time/Instant;", "set", "removeAll", "get", "build", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            line.getClass();
            int Q = StringsKt.Q(line, ':', 0, 6);
            if (Q != -1) {
                add(StringsKt.s0(line.substring(0, Q)).toString(), line.substring(Q + 1));
                return this;
            }
            f27.q("Unexpected header: ".concat(line));
            return null;
        }

        public final Builder addAll(Headers headers) {
            headers.getClass();
            return _HeadersCommonKt.commonAddAll(this, headers);
        }

        public final Builder addLenient$okhttp(String line) {
            line.getClass();
            int Q = StringsKt.Q(line, ':', 1, 4);
            if (Q != -1) {
                addLenient$okhttp(line.substring(0, Q), line.substring(Q + 1));
                return this;
            }
            if (line.charAt(0) == ':') {
                addLenient$okhttp("", line.substring(1));
                return this;
            }
            addLenient$okhttp("", line);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            name.getClass();
            value.getClass();
            _HeadersCommonKt.headersCheckName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return _HeadersCommonKt.commonBuild(this);
        }

        public final String get(String name) {
            name.getClass();
            return _HeadersCommonKt.commonGet(this, name);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            name.getClass();
            return _HeadersCommonKt.commonRemoveAll(this, name);
        }

        public final Builder set(String name, Instant value) {
            name.getClass();
            value.getClass();
            Date from = Date.from(value);
            from.getClass();
            return set(name, from);
        }

        public final Builder set(String name, Date value) {
            name.getClass();
            value.getClass();
            return set(name, DateFormattingKt.toHttpDateString(value));
        }

        public final Builder set(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonSet(this, name, value);
        }

        public final Builder add(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonAdd(this, name, value);
        }

        public final Builder add(String name, Date value) {
            name.getClass();
            value.getClass();
            return add(name, DateFormattingKt.toHttpDateString(value));
        }

        public final Builder addLenient$okhttp(String name, String value) {
            name.getClass();
            value.getClass();
            return _HeadersCommonKt.commonAddLenient(this, name, value);
        }

        public final Builder add(String name, Instant value) {
            name.getClass();
            value.getClass();
            Date from = Date.from(value);
            from.getClass();
            return add(name, from);
        }
    }
}
