package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J¨\u0001\u0010\u0015\u001a\u00020\u00002\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/network/models/SearchPayload;", "", "", "", "filterConditions", "", "forceDefaultSearch", "forceSqlV2Backend", "", "limit", "next", "offset", "query", "", "Lio/getstream/chat/android/network/models/SortParamRequest;", "sort", "messageFilterConditions", "Lio/getstream/chat/android/network/models/MessageOptions;", "messageOptions", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lio/getstream/chat/android/network/models/MessageOptions;)V", "copy", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lio/getstream/chat/android/network/models/MessageOptions;)Lio/getstream/chat/android/network/models/SearchPayload;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SearchPayload {
    public final Map a;
    public final Boolean b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final String g;
    public final List h;
    public final Map i;
    public final MessageOptions j;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public SearchPayload(java.util.Map r2, java.lang.Boolean r3, java.lang.Boolean r4, java.lang.Integer r5, java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.util.List r9, java.util.Map r10, io.getstream.chat.android.network.models.MessageOptions r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L9
            zc7 r2 = defpackage.zc7.a
            r2.getClass()
        L9:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lf
            r3 = r0
        Lf:
            r13 = r12 & 4
            if (r13 == 0) goto L14
            r4 = r0
        L14:
            r13 = r12 & 8
            if (r13 == 0) goto L19
            r5 = r0
        L19:
            r13 = r12 & 16
            if (r13 == 0) goto L1e
            r6 = r0
        L1e:
            r13 = r12 & 32
            if (r13 == 0) goto L23
            r7 = r0
        L23:
            r13 = r12 & 64
            if (r13 == 0) goto L28
            r8 = r0
        L28:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L30
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L30:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L39
            zc7 r10 = defpackage.zc7.a
            r10.getClass()
        L39:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L49
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L54
        L49:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L54:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.network.models.SearchPayload.<init>(java.util.Map, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.util.Map, io.getstream.chat.android.network.models.MessageOptions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final SearchPayload copy(@zca(name = "filter_conditions") Map<String, ? extends Object> filterConditions, @zca(name = "force_default_search") Boolean forceDefaultSearch, @zca(name = "force_sql_v2_backend") Boolean forceSqlV2Backend, @zca(name = "limit") Integer limit, @zca(name = "next") String next, @zca(name = "offset") Integer offset, @zca(name = "query") String query, @zca(name = "sort") List<SortParamRequest> sort, @zca(name = "message_filter_conditions") Map<String, ? extends Object> messageFilterConditions, @zca(name = "message_options") MessageOptions messageOptions) {
        filterConditions.getClass();
        return new SearchPayload(filterConditions, forceDefaultSearch, forceSqlV2Backend, limit, next, offset, query, sort, messageFilterConditions, messageOptions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPayload)) {
            return false;
        }
        SearchPayload searchPayload = (SearchPayload) obj;
        if (Intrinsics.areEqual(this.a, searchPayload.a) && Intrinsics.areEqual(this.b, searchPayload.b) && Intrinsics.areEqual(this.c, searchPayload.c) && Intrinsics.areEqual(this.d, searchPayload.d) && Intrinsics.areEqual(this.e, searchPayload.e) && Intrinsics.areEqual(this.f, searchPayload.f) && Intrinsics.areEqual(this.g, searchPayload.g) && Intrinsics.areEqual(this.h, searchPayload.h) && Intrinsics.areEqual(this.i, searchPayload.i) && Intrinsics.areEqual(this.j, searchPayload.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.a.hashCode() * 31;
        int i = 0;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode9 + hashCode) * 31;
        Boolean bool2 = this.c;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.e;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num2 = this.f;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List list = this.h;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Map map = this.i;
        if (map == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = map.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        MessageOptions messageOptions = this.j;
        if (messageOptions != null) {
            i = messageOptions.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchPayload(filterConditions=");
        sb.append(this.a);
        sb.append(", forceDefaultSearch=");
        sb.append(this.b);
        sb.append(", forceSqlV2Backend=");
        sb.append(this.c);
        sb.append(", limit=");
        sb.append(this.d);
        sb.append(", next=");
        sb.append(this.e);
        sb.append(", offset=");
        sb.append(this.f);
        sb.append(", query=");
        ace.C(sb, this.g, ", sort=", this.h, ", messageFilterConditions=");
        sb.append(this.i);
        sb.append(", messageOptions=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public SearchPayload(@zca(name = "filter_conditions") Map<String, ? extends Object> map, @zca(name = "force_default_search") Boolean bool, @zca(name = "force_sql_v2_backend") Boolean bool2, @zca(name = "limit") Integer num, @zca(name = "next") String str, @zca(name = "offset") Integer num2, @zca(name = "query") String str2, @zca(name = "sort") List<SortParamRequest> list, @zca(name = "message_filter_conditions") Map<String, ? extends Object> map2, @zca(name = "message_options") MessageOptions messageOptions) {
        map.getClass();
        this.a = map;
        this.b = bool;
        this.c = bool2;
        this.d = num;
        this.e = str;
        this.f = num2;
        this.g = str2;
        this.h = list;
        this.i = map2;
        this.j = messageOptions;
    }
}
