package defpackage;

import android.net.Uri;
import android.os.Bundle;
import io.ably.lib.util.AgentHeaderCreator;
import io.sentry.p6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ttc {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex r = new Regex("\\{(.+?)\\}");
    public static final Regex s = new Regex("http[s]?://");
    public static final Regex t = new Regex(p6.DEFAULT_PROPAGATION_TARGETS);
    public static final Regex u = new Regex("([^/]*?|)");
    public static final Regex v = new Regex("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public boolean i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final String n;
    public final Lazy o;
    public final boolean p;

    public ttc(String str, String str2, String str3) {
        List emptyList;
        boolean z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        final int i = 0;
        this.f = LazyKt.lazy(new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i2 = i;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i2) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i3 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i3) {
                                            String substring = str8.substring(i3, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i3 = find$default.a().b + 1;
                                    }
                                    if (i3 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i3);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.lazy(new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i2;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i3 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i3) {
                                            String substring = str8.substring(i3, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i3 = find$default.a().b + 1;
                                    }
                                    if (i3 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i3);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        w4b w4bVar = w4b.NONE;
        final int i3 = 2;
        this.h = LazyKt.a(w4bVar, new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i3;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i4 = 3;
        this.j = LazyKt.a(w4bVar, new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i4;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i5 = 4;
        this.k = LazyKt.a(w4bVar, new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i5;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i6 = 5;
        this.l = LazyKt.a(w4bVar, new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i6;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i7 = 6;
        this.m = LazyKt.lazy(new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i7;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        final int i8 = 7;
        this.o = LazyKt.lazy(new Function0(this) { // from class: qtc
            public final /* synthetic */ ttc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i8;
                boolean z2 = true;
                ttc ttcVar = this.b;
                switch (i22) {
                    case 0:
                        String str4 = ttcVar.e;
                        if (str4 == null) {
                            return null;
                        }
                        return new Regex(str4, ewf.IGNORE_CASE);
                    case 1:
                        String str5 = ttcVar.a;
                        if (str5 == null || !ttc.v.d(str5)) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = ttcVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) ttcVar.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                                    if (str8 == null) {
                                        ttcVar.i = true;
                                        str8 = str7;
                                    }
                                    stc stcVar = new stc();
                                    int i32 = 0;
                                    for (MatchResult find$default = Regex.find$default(ttc.r, str8, 0, 2, null); find$default != null; find$default = find$default.next()) {
                                        MatchGroup a = find$default.b().a(1);
                                        a.getClass();
                                        String str9 = a.a;
                                        str9.getClass();
                                        stcVar.b.add(str9);
                                        if (find$default.a().a > i32) {
                                            String substring = str8.substring(i32, find$default.a().a);
                                            Regex.b.getClass();
                                            String quote = Pattern.quote(substring);
                                            quote.getClass();
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i32 = find$default.a().b + 1;
                                    }
                                    if (i32 < str8.length()) {
                                        cwf cwfVar = Regex.b;
                                        String substring2 = str8.substring(i32);
                                        cwfVar.getClass();
                                        String quote2 = Pattern.quote(substring2);
                                        quote2.getClass();
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    stcVar.a = ttc.g(sb.toString());
                                    linkedHashMap.put(str7, stcVar);
                                } else {
                                    f27.q(hdi.p("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = ttcVar.a;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        ttc.a(fragment, arrayList2, sb2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) ttcVar.j.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) ttcVar.j.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str11 = (String) ttcVar.l.getValue();
                        if (str11 == null) {
                            return null;
                        }
                        return new Regex(str11, ewf.IGNORE_CASE);
                    default:
                        String str12 = ttcVar.n;
                        if (str12 == null) {
                            return null;
                        }
                        return new Regex(str12);
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.a.matcher(str).find()) {
                String pattern = s.a.pattern();
                pattern.getClass();
                sb.append(pattern);
            }
            MatchResult find$default = Regex.find$default(new Regex("(\\?|#|$)"), str, 0, 2, null);
            if (find$default != null) {
                a(str.substring(0, find$default.a().a), arrayList, sb);
                if (!t.a.matcher(sb).find() && !u.a.matcher(sb).find()) {
                    z = true;
                } else {
                    z = false;
                }
                this.p = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.e = g(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (new Regex("^[\\s\\S]+/[\\s\\S]+$").d(str3)) {
            List f = new Regex(AgentHeaderCreator.AGENT_DIVIDER).f(str3, 0);
            if (!f.isEmpty()) {
                ListIterator listIterator = f.listIterator(f.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.D0(listIterator.nextIndex() + 1, f);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            this.n = e.s(hdi.p("^(", (String) emptyList.get(0), "|[*]+)/(", (String) emptyList.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
            return;
        }
        f27.q(sv6.n("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
        throw null;
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (MatchResult find$default = Regex.find$default(r, str, 0, 2, null); find$default != null; find$default = find$default.next()) {
            MatchGroup a = find$default.b().a(1);
            a.getClass();
            arrayList.add(a.a);
            if (find$default.a().a > i) {
                cwf cwfVar = Regex.b;
                String substring = str.substring(i, find$default.a().a);
                cwfVar.getClass();
                String quote = Pattern.quote(substring);
                quote.getClass();
                sb.append(quote);
            }
            String pattern = u.a.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = find$default.a().b + 1;
        }
        if (i < str.length()) {
            cwf cwfVar2 = Regex.b;
            String substring2 = str.substring(i);
            cwfVar2.getClass();
            String quote2 = Pattern.quote(substring2);
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static String g(String str) {
        if (StringsKt.L(str, "\\Q", false) && StringsKt.L(str, "\\E", false)) {
            return e.s(str, p6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
        }
        if (StringsKt.L(str, "\\.\\*", false)) {
            return e.s(str, "\\.\\*", p6.DEFAULT_PROPAGATION_TARGETS);
        }
        return str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri != null && (str = this.a) != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(str);
            parse.getClass();
            return CollectionsKt.L(pathSegments, parse.getPathSegments()).size();
        }
        return 0;
    }

    public final ArrayList c() {
        Collection values = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            CollectionsKt.o(arrayList, ((stc) it.next()).b);
        }
        return CollectionsKt.i0(CollectionsKt.i0(this.d, arrayList), (List) this.k.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        b c;
        b c2;
        String str;
        String str2;
        uri.getClass();
        Regex regex = (Regex) this.f.getValue();
        if (regex != null && (c = regex.c(uri.toString())) != null) {
            zc7.a.getClass();
            Bundle a = ein.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(c, a, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || f(uri, a, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.m.getValue();
                if (regex2 != null && (c2 = regex2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String str3 = (String) obj;
                        MatchGroup a2 = c2.c.a(i2);
                        if (a2 != null && (str2 = a2.a) != null) {
                            str = Uri.decode(str2);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        atc atcVar = (atc) linkedHashMap.get(str3);
                        if (atcVar != null) {
                            try {
                                atcVar.a.parseAndPut(a, str3, str);
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            nyn.f(a, str3, str);
                        }
                        arrayList.add(Unit.INSTANCE);
                        i = i2;
                    }
                }
                if (bin.d(linkedHashMap, new rtc(0, a)).isEmpty()) {
                    return a;
                }
            }
        }
        return null;
    }

    public final boolean e(b bVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) next;
            MatchGroup a = bVar.c.a(i2);
            if (a != null && (str2 = a.a) != null) {
                str = Uri.decode(str2);
                str.getClass();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            atc atcVar = (atc) linkedHashMap.get(str3);
            if (atcVar != null) {
                try {
                    atcVar.a.parseAndPut(bundle, str3, str);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                nyn.f(bundle, str3, str);
            }
            arrayList2.add(Unit.INSTANCE);
            i = i2;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ttc)) {
            ttc ttcVar = (ttc) obj;
            if (Intrinsics.areEqual(this.a, ttcVar.a) && Intrinsics.areEqual(this.b, ttcVar.b) && Intrinsics.areEqual(this.c, ttcVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.LinkedHashMap] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        b bVar;
        String str;
        Object obj;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str2 = (String) entry.getKey();
            stc stcVar = (stc) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str2);
            if (this.i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = eb4.c(query);
            }
            zc7.a.getClass();
            boolean z2 = false;
            Bundle a = ein.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = stcVar.b.iterator();
            while (true) {
                e0d e0dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                atc atcVar = (atc) linkedHashMap.get(str3);
                if (atcVar != null) {
                    e0dVar = atcVar.a;
                }
                if ((e0dVar instanceof ya4) && !atcVar.c) {
                    ya4 ya4Var = (ya4) e0dVar;
                    ya4Var.put(a, str3, ya4Var.a());
                }
            }
            for (String str4 : queryParameters) {
                String str5 = stcVar.a;
                if (str5 != null) {
                    bVar = new Regex(str5).c(str4);
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return z2;
                }
                ArrayList arrayList = stcVar.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList));
                Iterator it2 = arrayList.iterator();
                ?? r13 = z2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i = r13 + 1;
                    if (r13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str6 = (String) next;
                    MatchGroup a2 = bVar.c.a(i);
                    if (a2 != null) {
                        str = a2.a;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    atc atcVar2 = (atc) linkedHashMap.get(str6);
                    try {
                        if (!iyn.a(a, str6)) {
                            if (atcVar2 != null) {
                                atcVar2.a.parseAndPut(a, str6, str);
                            } else {
                                nyn.f(a, str6, str);
                            }
                            obj = Unit.INSTANCE;
                        } else {
                            if (!a.containsKey(str6)) {
                                z = true;
                            } else {
                                if (atcVar2 != null) {
                                    e0d e0dVar2 = atcVar2.a;
                                    e0dVar2.parseAndPut(a, str6, str, e0dVar2.get(a, str6));
                                }
                                z = false;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.INSTANCE;
                    }
                    arrayList2.add(obj);
                    r13 = i;
                    z2 = false;
                }
            }
            bundle.putAll(a);
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
