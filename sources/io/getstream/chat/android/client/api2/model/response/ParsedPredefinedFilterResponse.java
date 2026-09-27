package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ix2;
import defpackage.mda;
import defpackage.sv6;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007HÆ\u0003JG\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "", Keys.KEY_NAME, "", "filter", "", "sort", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getFilter", "()Ljava/util/Map;", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ParsedPredefinedFilterResponse {
    private final Map<String, Object> filter;
    private final String name;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsedPredefinedFilterResponse(String str, Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        str.getClass();
        map.getClass();
        this.name = str;
        this.filter = map;
        this.sort = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedPredefinedFilterResponse copy$default(ParsedPredefinedFilterResponse parsedPredefinedFilterResponse, String str, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedPredefinedFilterResponse.name;
        }
        if ((i & 2) != 0) {
            map = parsedPredefinedFilterResponse.filter;
        }
        if ((i & 4) != 0) {
            list = parsedPredefinedFilterResponse.sort;
        }
        return parsedPredefinedFilterResponse.copy(str, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.filter;
    }

    public final List<Map<String, Object>> component3() {
        return this.sort;
    }

    public final ParsedPredefinedFilterResponse copy(String name, Map<String, ? extends Object> filter, List<? extends Map<String, ? extends Object>> sort) {
        name.getClass();
        filter.getClass();
        return new ParsedPredefinedFilterResponse(name, filter, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedPredefinedFilterResponse)) {
            return false;
        }
        ParsedPredefinedFilterResponse parsedPredefinedFilterResponse = (ParsedPredefinedFilterResponse) other;
        if (Intrinsics.areEqual(this.name, parsedPredefinedFilterResponse.name) && Intrinsics.areEqual(this.filter, parsedPredefinedFilterResponse.filter) && Intrinsics.areEqual(this.sort, parsedPredefinedFilterResponse.sort)) {
            return true;
        }
        return false;
    }

    public final Map<String, Object> getFilter() {
        return this.filter;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int hashCode;
        int c = sv6.c(this.filter, this.name.hashCode() * 31, 31);
        List<Map<String, Object>> list = this.sort;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return c + hashCode;
    }

    public String toString() {
        String str = this.name;
        Map<String, Object> map = this.filter;
        List<Map<String, Object>> list = this.sort;
        StringBuilder sb = new StringBuilder("ParsedPredefinedFilterResponse(name=");
        sb.append(str);
        sb.append(", filter=");
        sb.append(map);
        sb.append(", sort=");
        return ix2.q(sb, list, ")");
    }

    public /* synthetic */ ParsedPredefinedFilterResponse(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : list);
    }
}
