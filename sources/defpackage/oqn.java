package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.polymarket.android.R;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.AnswerEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.OptionEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.VoteEntity;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class oqn {
    public static final int a(View view, int i) {
        int i2 = 0;
        int i3 = bd0.API_PRIORITY_OTHER;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj == null) {
                    obj = tag;
                } else if (!Intrinsics.areEqual(tag, obj)) {
                    break;
                }
                i3 = i2;
            }
            i2++;
            Object b = c5n.b(view);
            if (b instanceof View) {
                view = (View) b;
            } else {
                view = null;
            }
        }
        return i3;
    }

    public static final View b(View view) {
        View view2;
        if (view.isAttachedToWindow()) {
            int min = Math.min(a(view, R.id.view_tree_lifecycle_owner), a(view, R.id.view_tree_saved_state_registry_owner));
            View view3 = view;
            int i = 0;
            View view4 = view3;
            while (view != null) {
                if (i == min) {
                    if (!(view.getParent() instanceof ViewGroup)) {
                        return view3;
                    }
                } else if (c(view) == null) {
                    i++;
                    Object b = c5n.b(view);
                    if (b instanceof View) {
                        view2 = (View) b;
                    } else {
                        view2 = null;
                    }
                    View view5 = view3;
                    view3 = view;
                    view = view2;
                    view4 = view5;
                }
                return view;
            }
            return view4;
        }
        return view;
    }

    public static final mq4 c(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            return null;
        }
        return (mq4) weakReference.get();
    }

    public static final VoteEntity d(Vote vote) {
        String str;
        vote.getClass();
        String id = vote.getId();
        String optionId = vote.getOptionId();
        String pollId = vote.getPollId();
        Date createdAt = vote.getCreatedAt();
        Date updatedAt = vote.getUpdatedAt();
        User user = vote.getUser();
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        return new VoteEntity(id, pollId, optionId, str, createdAt, updatedAt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v61, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v15, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [q55, yte] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x043c -> B:21:0x045a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x034c -> B:35:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0267 -> B:45:0x0270). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(cte cteVar, byf byfVar, q55 q55Var) {
        ?? r2;
        int i;
        Iterator it;
        String str;
        String str2;
        String str3;
        Collection collection;
        int i2;
        byf byfVar2;
        ArrayList arrayList;
        int i3;
        Date date;
        VotingVisibility votingVisibility;
        boolean z;
        boolean z2;
        Map map;
        Iterator it2;
        u85 u85Var;
        VotingVisibility votingVisibility2;
        int i4;
        byf byfVar3;
        List list;
        boolean z3;
        int i5;
        ArrayList arrayList2;
        cte cteVar2;
        ArrayList arrayList3;
        Integer num;
        Date date2;
        yte yteVar;
        int i6;
        ArrayList arrayList4;
        List list2;
        byf byfVar4;
        VotingVisibility votingVisibility3;
        u85 u85Var2;
        int i7;
        Integer num2;
        ArrayList arrayList5;
        Iterator it3;
        Date date3;
        cte cteVar3;
        int i8;
        boolean z4;
        Date date4;
        boolean z5;
        int i9;
        int i10;
        ArrayList arrayList6;
        Integer num3;
        boolean z6;
        VotingVisibility votingVisibility4;
        Date date5;
        int i11;
        String str4;
        String str5;
        boolean z7;
        boolean z8;
        ArrayList arrayList7;
        List list3;
        cte cteVar4;
        User user;
        Date date6;
        int i12;
        boolean z9;
        Map map2;
        String str6;
        String str7;
        String str8;
        boolean z10;
        ArrayList arrayList8;
        Integer num4;
        VotingVisibility votingVisibility5;
        Date date7;
        boolean z11;
        List list4;
        cte cteVar5;
        boolean z12;
        int i13;
        ArrayList arrayList9;
        cte cteVar6 = cteVar;
        if (q55Var instanceof yte) {
            yte yteVar2 = (yte) q55Var;
            int i14 = yteVar2.M;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yteVar2.M = i14 - Integer.MIN_VALUE;
                r2 = yteVar2;
                Object obj = r2.L;
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                i = r2.M;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    int i15 = r2.E;
                                    z12 = r2.K;
                                    i13 = r2.D;
                                    z11 = r2.J;
                                    z10 = r2.I;
                                    boolean z13 = r2.H;
                                    List list5 = r2.x;
                                    ?? r9 = (List) r2.w;
                                    Map map3 = r2.v;
                                    num4 = r2.u;
                                    votingVisibility5 = (VotingVisibility) r2.t;
                                    Date date8 = (Date) r2.s;
                                    date7 = r2.r;
                                    list4 = r2.q;
                                    List list6 = r2.p;
                                    String str9 = r2.o;
                                    str7 = r2.n;
                                    str8 = r2.m;
                                    Function2 function2 = r2.l;
                                    cteVar5 = r2.k;
                                    ResultKt.a(obj);
                                    arrayList3 = list6;
                                    map = map3;
                                    date3 = date8;
                                    str3 = str9;
                                    z4 = z13;
                                    i10 = i15;
                                    arrayList9 = list5;
                                    arrayList8 = r9;
                                    user = (User) obj;
                                    z6 = z12;
                                    i11 = i13;
                                    z8 = z11;
                                    z7 = z10;
                                    arrayList6 = arrayList9;
                                    arrayList7 = arrayList8;
                                    num3 = num4;
                                    votingVisibility4 = votingVisibility5;
                                    date5 = date7;
                                    list3 = list4;
                                    str4 = str7;
                                    str5 = str8;
                                    cteVar4 = cteVar5;
                                    date6 = date3;
                                    i12 = i10;
                                    str6 = str3;
                                    z9 = z4;
                                    map2 = map;
                                    return new Poll(str5, str4, str6, arrayList3, votingVisibility4, z9, num3, z7, z8, i11, map2, list3, arrayList7, date5, date6, z6, i12, arrayList6, user, cteVar4.t);
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i16 = r2.G;
                            int i17 = r2.F;
                            int i18 = r2.E;
                            boolean z14 = r2.K;
                            int i19 = r2.D;
                            boolean z15 = r2.J;
                            boolean z16 = r2.I;
                            boolean z17 = r2.H;
                            Collection collection2 = r2.C;
                            Iterator it4 = r2.A;
                            ?? r6 = (Collection) r2.z;
                            Collection collection3 = r2.y;
                            List list7 = r2.x;
                            ?? r92 = (List) r2.w;
                            Map map4 = r2.v;
                            Integer num5 = r2.u;
                            VotingVisibility votingVisibility6 = (VotingVisibility) r2.t;
                            Date date9 = (Date) r2.s;
                            Date date10 = r2.r;
                            List list8 = r2.q;
                            List list9 = r2.p;
                            String str10 = r2.o;
                            String str11 = r2.n;
                            String str12 = r2.m;
                            byf byfVar5 = r2.l;
                            cte cteVar7 = r2.k;
                            ResultKt.a(obj);
                            Map map5 = map4;
                            str3 = str10;
                            ArrayList arrayList10 = list9;
                            z = z16;
                            z4 = z17;
                            int i20 = i18;
                            List list10 = list8;
                            arrayList5 = r6;
                            ArrayList arrayList11 = r92;
                            yteVar = r2;
                            u85 u85Var4 = u85Var3;
                            votingVisibility3 = votingVisibility6;
                            cte cteVar8 = cteVar7;
                            boolean z18 = z15;
                            str = str12;
                            num2 = num5;
                            int i21 = i17;
                            z5 = z14;
                            i5 = i19;
                            str2 = str11;
                            Iterator it5 = it4;
                            date4 = date10;
                            int i22 = i16;
                            collection2.add((Answer) obj);
                            cteVar3 = cteVar8;
                            z2 = z18;
                            date3 = date9;
                            i9 = i22;
                            arrayList4 = arrayList11;
                            map = map5;
                            arrayList3 = arrayList10;
                            i8 = i21;
                            byfVar4 = byfVar5;
                            list2 = list10;
                            u85Var2 = u85Var4;
                            it3 = it5;
                            i7 = i20;
                            if (it3.hasNext()) {
                                boolean z19 = z5;
                                AnswerEntity answerEntity = (AnswerEntity) it3.next();
                                yteVar.k = cteVar3;
                                cte cteVar9 = cteVar3;
                                yteVar.l = byfVar4;
                                yteVar.m = str;
                                yteVar.n = str2;
                                yteVar.o = str3;
                                yteVar.p = arrayList3;
                                yteVar.q = list2;
                                yteVar.r = date4;
                                yteVar.s = date3;
                                yteVar.t = votingVisibility3;
                                yteVar.u = num2;
                                yteVar.v = map;
                                yteVar.w = arrayList4;
                                yteVar.x = null;
                                yteVar.y = null;
                                yteVar.z = arrayList5;
                                yteVar.A = it3;
                                yteVar.B = null;
                                yteVar.C = arrayList5;
                                yteVar.H = z4;
                                yteVar.I = z;
                                yteVar.J = z2;
                                yteVar.D = i5;
                                yteVar.K = z19;
                                ArrayList arrayList12 = arrayList5;
                                int i23 = i7;
                                yteVar.E = i23;
                                it5 = it3;
                                yteVar.F = i8;
                                yteVar.G = i9;
                                yteVar.M = 3;
                                Object f = f(answerEntity, byfVar4, yteVar);
                                u85Var4 = u85Var2;
                                if (f != u85Var4) {
                                    z5 = z19;
                                    obj = f;
                                    i20 = i23;
                                    map5 = map;
                                    list10 = list2;
                                    arrayList5 = arrayList12;
                                    i22 = i9;
                                    i21 = i8;
                                    z18 = z2;
                                    arrayList10 = arrayList3;
                                    collection2 = arrayList5;
                                    arrayList11 = arrayList4;
                                    date9 = date3;
                                    cteVar8 = cteVar9;
                                    byfVar5 = byfVar4;
                                    collection2.add((Answer) obj);
                                    cteVar3 = cteVar8;
                                    z2 = z18;
                                    date3 = date9;
                                    i9 = i22;
                                    arrayList4 = arrayList11;
                                    map = map5;
                                    arrayList3 = arrayList10;
                                    i8 = i21;
                                    byfVar4 = byfVar5;
                                    list2 = list10;
                                    u85Var2 = u85Var4;
                                    it3 = it5;
                                    i7 = i20;
                                    if (it3.hasNext()) {
                                        cte cteVar10 = cteVar3;
                                        boolean z20 = z5;
                                        ArrayList arrayList13 = arrayList5;
                                        i10 = i7;
                                        ArrayList arrayList14 = arrayList13;
                                        String str13 = cteVar10.s;
                                        if (str13 != null) {
                                            yteVar.k = cteVar10;
                                            yteVar.l = null;
                                            yteVar.m = str;
                                            yteVar.n = str2;
                                            yteVar.o = str3;
                                            yteVar.p = arrayList3;
                                            yteVar.q = list2;
                                            yteVar.r = date4;
                                            yteVar.s = date3;
                                            yteVar.t = votingVisibility3;
                                            yteVar.u = num2;
                                            yteVar.v = map;
                                            yteVar.w = arrayList4;
                                            yteVar.x = arrayList14;
                                            yteVar.y = null;
                                            yteVar.z = null;
                                            yteVar.A = null;
                                            yteVar.B = null;
                                            yteVar.C = null;
                                            yteVar.H = z4;
                                            yteVar.I = z;
                                            yteVar.J = z2;
                                            yteVar.D = i5;
                                            yteVar.K = z20;
                                            yteVar.E = i10;
                                            yteVar.F = 0;
                                            yteVar.M = 4;
                                            Object invoke = byfVar4.invoke(str13, yteVar);
                                            u85 u85Var5 = u85Var2;
                                            if (invoke == u85Var5) {
                                                return u85Var5;
                                            }
                                            str7 = str2;
                                            str8 = str;
                                            z10 = z;
                                            arrayList8 = arrayList4;
                                            num4 = num2;
                                            votingVisibility5 = votingVisibility3;
                                            date7 = date4;
                                            z11 = z2;
                                            list4 = list2;
                                            cteVar5 = cteVar10;
                                            z12 = z20;
                                            obj = invoke;
                                            i13 = i5;
                                            arrayList9 = arrayList14;
                                            user = (User) obj;
                                            z6 = z12;
                                            i11 = i13;
                                            z8 = z11;
                                            z7 = z10;
                                            arrayList6 = arrayList9;
                                            arrayList7 = arrayList8;
                                            num3 = num4;
                                            votingVisibility4 = votingVisibility5;
                                            date5 = date7;
                                            list3 = list4;
                                            str4 = str7;
                                            str5 = str8;
                                            cteVar4 = cteVar5;
                                            date6 = date3;
                                            i12 = i10;
                                            str6 = str3;
                                            z9 = z4;
                                            map2 = map;
                                            return new Poll(str5, str4, str6, arrayList3, votingVisibility4, z9, num3, z7, z8, i11, map2, list3, arrayList7, date5, date6, z6, i12, arrayList6, user, cteVar4.t);
                                        }
                                        arrayList6 = arrayList14;
                                        num3 = num2;
                                        z6 = z20;
                                        votingVisibility4 = votingVisibility3;
                                        date5 = date4;
                                        i11 = i5;
                                        str4 = str2;
                                        str5 = str;
                                        z7 = z;
                                        z8 = z2;
                                        arrayList7 = arrayList4;
                                        list3 = list2;
                                        cteVar4 = cteVar10;
                                        user = null;
                                        date6 = date3;
                                        i12 = i10;
                                        z9 = z4;
                                        map2 = map;
                                        str6 = str3;
                                        return new Poll(str5, str4, str6, arrayList3, votingVisibility4, z9, num3, z7, z8, i11, map2, list3, arrayList7, date5, date6, z6, i12, arrayList6, user, cteVar4.t);
                                    }
                                } else {
                                    return u85Var4;
                                }
                            }
                        } else {
                            int i24 = r2.F;
                            int i25 = r2.E;
                            int i26 = r2.D;
                            boolean z21 = r2.J;
                            boolean z22 = r2.I;
                            boolean z23 = r2.H;
                            Collection collection4 = r2.B;
                            Iterator it6 = (Iterator) r2.z;
                            Collection collection5 = r2.y;
                            List list11 = r2.x;
                            Collection collection6 = r2.w;
                            Map map6 = r2.v;
                            Integer num6 = r2.u;
                            VotingVisibility votingVisibility7 = (VotingVisibility) r2.t;
                            Date date11 = (Date) r2.s;
                            int i27 = i24;
                            Date date12 = r2.r;
                            list = r2.q;
                            List list12 = r2.p;
                            String str14 = r2.o;
                            String str15 = r2.n;
                            String str16 = r2.m;
                            Function2 function22 = r2.l;
                            cte cteVar11 = r2.k;
                            ResultKt.a(obj);
                            cte cteVar12 = cteVar11;
                            u85 u85Var6 = u85Var3;
                            byf byfVar6 = function22;
                            ArrayList arrayList15 = collection5;
                            str = str16;
                            i5 = i26;
                            z3 = z23;
                            num = num6;
                            z = z22;
                            ArrayList arrayList16 = list12;
                            Map map7 = map6;
                            date2 = date11;
                            i4 = i25;
                            date = date12;
                            boolean z24 = z21;
                            yteVar = r2;
                            Object obj2 = obj;
                            List list13 = list;
                            collection4.add((Vote) obj2);
                            list = list13;
                            byfVar3 = byfVar6;
                            it2 = it6;
                            votingVisibility2 = votingVisibility7;
                            i6 = i27;
                            z2 = z24;
                            str3 = str14;
                            str2 = str15;
                            arrayList2 = arrayList15;
                            map = map7;
                            arrayList3 = arrayList16;
                            u85Var = u85Var6;
                            cteVar2 = cteVar12;
                            if (it2.hasNext()) {
                                byf byfVar7 = byfVar3;
                                VoteEntity voteEntity = (VoteEntity) it2.next();
                                yteVar.k = cteVar2;
                                cteVar12 = cteVar2;
                                yteVar.l = byfVar7;
                                yteVar.m = str;
                                yteVar.n = str2;
                                yteVar.o = str3;
                                yteVar.p = arrayList3;
                                yteVar.q = list;
                                yteVar.r = date;
                                yteVar.s = date2;
                                yteVar.t = votingVisibility2;
                                yteVar.u = num;
                                yteVar.v = map;
                                yteVar.w = null;
                                yteVar.x = null;
                                ArrayList arrayList17 = arrayList2;
                                yteVar.y = arrayList17;
                                VotingVisibility votingVisibility8 = votingVisibility2;
                                Iterator it7 = it2;
                                yteVar.z = it7;
                                yteVar.A = null;
                                yteVar.B = arrayList17;
                                yteVar.H = z3;
                                yteVar.I = z;
                                yteVar.J = z2;
                                yteVar.D = i5;
                                yteVar.E = i4;
                                yteVar.F = i6;
                                yteVar.G = 0;
                                yteVar.M = 2;
                                byfVar6 = byfVar7;
                                obj = g(voteEntity, byfVar6, yteVar);
                                u85Var6 = u85Var;
                                if (obj == u85Var6) {
                                    return u85Var6;
                                }
                                Map map8 = map;
                                z24 = z2;
                                votingVisibility7 = votingVisibility8;
                                map7 = map8;
                                str15 = str2;
                                arrayList15 = arrayList2;
                                it6 = it7;
                                i27 = i6;
                                arrayList16 = arrayList3;
                                str14 = str3;
                                collection4 = arrayList15;
                                Object obj22 = obj;
                                List list132 = list;
                                collection4.add((Vote) obj22);
                                list = list132;
                                byfVar3 = byfVar6;
                                it2 = it6;
                                votingVisibility2 = votingVisibility7;
                                i6 = i27;
                                z2 = z24;
                                str3 = str14;
                                str2 = str15;
                                arrayList2 = arrayList15;
                                map = map7;
                                arrayList3 = arrayList16;
                                u85Var = u85Var6;
                                cteVar2 = cteVar12;
                                if (it2.hasNext()) {
                                    cte cteVar13 = cteVar2;
                                    VotingVisibility votingVisibility9 = votingVisibility2;
                                    byf byfVar8 = byfVar3;
                                    arrayList4 = arrayList2;
                                    boolean z25 = cteVar13.p;
                                    int i28 = cteVar13.q;
                                    List list14 = cteVar13.r;
                                    list2 = list;
                                    byfVar4 = byfVar8;
                                    votingVisibility3 = votingVisibility9;
                                    u85Var2 = u85Var;
                                    i7 = i28;
                                    num2 = num;
                                    arrayList5 = new ArrayList(CollectionsKt.w(list14));
                                    it3 = list14.iterator();
                                    date3 = date2;
                                    cteVar3 = cteVar13;
                                    i8 = 0;
                                    z4 = z3;
                                    date4 = date;
                                    z5 = z25;
                                    i9 = 0;
                                    if (it3.hasNext()) {
                                    }
                                }
                            }
                        }
                    } else {
                        int i29 = r2.E;
                        i2 = r2.D;
                        collection = r2.w;
                        it = (Iterator) r2.t;
                        Collection collection7 = (Collection) r2.s;
                        List list15 = r2.q;
                        List list16 = r2.p;
                        String str17 = r2.o;
                        String str18 = r2.n;
                        String str19 = r2.m;
                        Function2 function23 = r2.l;
                        cte cteVar14 = r2.k;
                        ResultKt.a(obj);
                        int i30 = i29;
                        cteVar6 = cteVar14;
                        String str20 = str19;
                        String str21 = str18;
                        String str22 = str17;
                        ArrayList arrayList18 = list16;
                        byf byfVar9 = function23;
                        collection.add((Vote) obj);
                        collection = collection7;
                        i3 = i30;
                        arrayList = arrayList18;
                        str3 = str22;
                        str2 = str21;
                        byfVar2 = byfVar9;
                        str = str20;
                        if (it.hasNext()) {
                            VoteEntity voteEntity2 = (VoteEntity) it.next();
                            r2.k = cteVar6;
                            r2.l = byfVar2;
                            r2.m = str;
                            r2.n = str2;
                            r2.o = str3;
                            r2.p = arrayList;
                            r2.q = null;
                            r2.r = null;
                            r2.s = collection;
                            r2.t = it;
                            r2.u = null;
                            r2.v = null;
                            r2.w = collection;
                            r2.D = i2;
                            r2.E = i3;
                            r2.F = 0;
                            r2.M = 1;
                            Object g = g(voteEntity2, byfVar2, r2);
                            if (g == u85Var3) {
                                return u85Var3;
                            }
                            byfVar9 = byfVar2;
                            obj = g;
                            str20 = str;
                            str21 = str2;
                            str22 = str3;
                            arrayList18 = arrayList;
                            i30 = i3;
                            collection7 = collection;
                            collection.add((Vote) obj);
                            collection = collection7;
                            i3 = i30;
                            arrayList = arrayList18;
                            str3 = str22;
                            str2 = str21;
                            byfVar2 = byfVar9;
                            str = str20;
                            if (it.hasNext()) {
                                List list17 = (List) collection;
                                date = cteVar6.n;
                                Date date13 = cteVar6.o;
                                String str23 = cteVar6.e;
                                str23.getClass();
                                if (Intrinsics.areEqual(str23, "public")) {
                                    votingVisibility = VotingVisibility.PUBLIC;
                                } else if (Intrinsics.areEqual(str23, "anonymous")) {
                                    votingVisibility = VotingVisibility.ANONYMOUS;
                                } else {
                                    dmk.v("Unknown voting visibility: ".concat(str23));
                                    return null;
                                }
                                boolean z26 = cteVar6.f;
                                Integer num7 = cteVar6.g;
                                z = cteVar6.h;
                                z2 = cteVar6.i;
                                byf byfVar10 = byfVar2;
                                int i31 = cteVar6.j;
                                map = cteVar6.k;
                                List list18 = cteVar6.m;
                                cte cteVar15 = cteVar6;
                                ArrayList arrayList19 = new ArrayList(CollectionsKt.w(list18));
                                it2 = list18.iterator();
                                u85Var = u85Var3;
                                votingVisibility2 = votingVisibility;
                                i4 = 0;
                                byfVar3 = byfVar10;
                                list = list17;
                                z3 = z26;
                                i5 = i31;
                                arrayList2 = arrayList19;
                                cteVar2 = cteVar15;
                                arrayList3 = arrayList;
                                num = num7;
                                date2 = date13;
                                yteVar = r2;
                                i6 = 0;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                    }
                } else {
                    ResultKt.a(obj);
                    String str24 = cteVar6.a;
                    String str25 = cteVar6.b;
                    String str26 = cteVar6.c;
                    List<OptionEntity> list19 = cteVar6.d;
                    ArrayList arrayList20 = new ArrayList(CollectionsKt.w(list19));
                    for (OptionEntity optionEntity : list19) {
                        optionEntity.getClass();
                        arrayList20.add(new Option(optionEntity.a, optionEntity.b, optionEntity.c));
                    }
                    List list20 = cteVar6.l;
                    ArrayList arrayList21 = new ArrayList(CollectionsKt.w(list20));
                    it = list20.iterator();
                    str = str24;
                    str2 = str25;
                    str3 = str26;
                    collection = arrayList21;
                    i2 = 0;
                    byfVar2 = byfVar;
                    arrayList = arrayList20;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        r2 = new q55(q55Var);
        Object obj3 = r2.L;
        u85 u85Var32 = u85.COROUTINE_SUSPENDED;
        i = r2.M;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(AnswerEntity answerEntity, Function2 function2, q55 q55Var) {
        aue aueVar;
        int i;
        String str;
        String str2;
        Date date;
        Date date2;
        String str3;
        User user;
        String str4;
        String str5;
        String str6;
        Date date3;
        Date date4;
        if (q55Var instanceof aue) {
            aue aueVar2 = (aue) q55Var;
            int i2 = aueVar2.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aueVar2.q = i2 - Integer.MIN_VALUE;
                aueVar = aueVar2;
                Object obj = aueVar.p;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = aueVar.q;
                if (i == 0) {
                    if (i == 1) {
                        date4 = aueVar.o;
                        date3 = aueVar.n;
                        str6 = aueVar.m;
                        str = aueVar.l;
                        str5 = aueVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String str7 = answerEntity.a;
                    str = answerEntity.b;
                    String str8 = answerEntity.c;
                    Date date5 = answerEntity.d;
                    Date date6 = answerEntity.e;
                    String str9 = answerEntity.f;
                    if (str9 != null) {
                        aueVar.k = str7;
                        aueVar.l = str;
                        aueVar.m = str8;
                        aueVar.n = date5;
                        aueVar.o = date6;
                        aueVar.q = 1;
                        Object invoke = function2.invoke(str9, aueVar);
                        if (invoke == u85Var) {
                            return u85Var;
                        }
                        str5 = str7;
                        str6 = str8;
                        date3 = date5;
                        obj = invoke;
                        date4 = date6;
                    } else {
                        str2 = str8;
                        date = date5;
                        date2 = date6;
                        str3 = str7;
                        user = null;
                        str4 = str;
                        return new Answer(str3, str4, str2, date, date2, user);
                    }
                }
                date2 = date4;
                date = date3;
                str3 = str5;
                str2 = str6;
                str4 = str;
                user = (User) obj;
                return new Answer(str3, str4, str2, date, date2, user);
            }
        }
        aueVar = new q55(q55Var);
        Object obj2 = aueVar.p;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = aueVar.q;
        if (i == 0) {
        }
        date2 = date4;
        date = date3;
        str3 = str5;
        str2 = str6;
        str4 = str;
        user = (User) obj2;
        return new Answer(str3, str4, str2, date, date2, user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(VoteEntity voteEntity, Function2 function2, q55 q55Var) {
        zte zteVar;
        int i;
        String str;
        Date date;
        Date date2;
        String str2;
        String str3;
        String str4;
        String str5;
        Date date3;
        Date date4;
        if (q55Var instanceof zte) {
            zte zteVar2 = (zte) q55Var;
            int i2 = zteVar2.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zteVar2.q = i2 - Integer.MIN_VALUE;
                zteVar = zteVar2;
                Object obj = zteVar.p;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = zteVar.q;
                User user = null;
                if (i == 0) {
                    if (i == 1) {
                        date4 = zteVar.o;
                        date3 = zteVar.n;
                        str5 = zteVar.m;
                        str = zteVar.l;
                        str4 = zteVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String str6 = voteEntity.a;
                    str = voteEntity.c;
                    String str7 = voteEntity.b;
                    Date date5 = voteEntity.d;
                    Date date6 = voteEntity.e;
                    String str8 = voteEntity.f;
                    if (str8 != null) {
                        zteVar.k = str6;
                        zteVar.l = str;
                        zteVar.m = str7;
                        zteVar.n = date5;
                        zteVar.o = date6;
                        zteVar.q = 1;
                        Object invoke = function2.invoke(str8, zteVar);
                        if (invoke == u85Var) {
                            return u85Var;
                        }
                        str4 = str6;
                        str5 = str7;
                        date3 = date5;
                        obj = invoke;
                        date4 = date6;
                    } else {
                        date = date5;
                        date2 = date6;
                        str2 = str6;
                        str3 = str7;
                        return new Vote(str2, str3, str, date, date2, user);
                    }
                }
                user = (User) obj;
                date2 = date4;
                date = date3;
                str2 = str4;
                str3 = str5;
                return new Vote(str2, str3, str, date, date2, user);
            }
        }
        zteVar = new q55(q55Var);
        Object obj2 = zteVar.p;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = zteVar.q;
        User user2 = null;
        if (i == 0) {
        }
        user2 = (User) obj2;
        date2 = date4;
        date = date3;
        str2 = str4;
        str3 = str5;
        return new Vote(str2, str3, str, date, date2, user2);
    }
}
