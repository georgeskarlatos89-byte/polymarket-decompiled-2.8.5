package defpackage;

import android.graphics.Bitmap;
import com.polymarket.clients.ClientChatBattleReaction;
import com.polymarket.clients.ClientChatBattleSide;
import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatMessageContentType;
import com.polymarket.clients.ClientChatMessageReaction;
import com.polymarket.data.EEvent;
import com.polymarket.data.ELatestHighlight;
import com.polymarket.data.ESportsSlug;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.USChatViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zm3 implements eb8 {
    public final /* synthetic */ USChatViewModel a;
    public final /* synthetic */ EEvent.SportsGame.TeamsPair b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ sm3 e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ qqc g;
    public final /* synthetic */ qqc h;
    public final /* synthetic */ t85 i;
    public final /* synthetic */ qqc j;
    public final /* synthetic */ dpc k;
    public final /* synthetic */ dpc l;
    public final /* synthetic */ qqc m;
    public final /* synthetic */ qqc n;
    public final /* synthetic */ qqc o;
    public final /* synthetic */ qqc p;
    public final /* synthetic */ qqc q;
    public final /* synthetic */ qqc r;
    public final /* synthetic */ qqc s;
    public final /* synthetic */ qqc t;
    public final /* synthetic */ qqc u;

    public zm3(USChatViewModel uSChatViewModel, EEvent.SportsGame.TeamsPair teamsPair, String str, String str2, sm3 sm3Var, Set set, qqc qqcVar, qqc qqcVar2, t85 t85Var, qqc qqcVar3, dpc dpcVar, dpc dpcVar2, qqc qqcVar4, qqc qqcVar5, qqc qqcVar6, qqc qqcVar7, qqc qqcVar8, qqc qqcVar9, qqc qqcVar10, qqc qqcVar11, qqc qqcVar12) {
        this.a = uSChatViewModel;
        this.b = teamsPair;
        this.c = str;
        this.d = str2;
        this.e = sm3Var;
        this.f = set;
        this.g = qqcVar;
        this.h = qqcVar2;
        this.i = t85Var;
        this.j = qqcVar3;
        this.k = dpcVar;
        this.l = dpcVar2;
        this.m = qqcVar4;
        this.n = qqcVar5;
        this.o = qqcVar6;
        this.p = qqcVar7;
        this.q = qqcVar8;
        this.r = qqcVar9;
        this.s = qqcVar10;
        this.t = qqcVar11;
        this.u = qqcVar12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [wm3] */
    /* JADX WARN: Type inference failed for: r0v13, types: [vm3] */
    /* JADX WARN: Type inference failed for: r0v15, types: [vm3] */
    /* JADX WARN: Type inference failed for: r0v17, types: [wm3] */
    /* JADX WARN: Type inference failed for: r0v30, types: [vm3] */
    /* JADX WARN: Type inference failed for: r0v33, types: [wm3] */
    /* JADX WARN: Type inference failed for: r0v9, types: [wm3] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [x85, java.util.concurrent.CancellationException, java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        USChatViewModel uSChatViewModel;
        EEvent event;
        ESportsSlug sportSlug;
        ClientChatMessageContentType.PlayByPlayCase playByPlayCase;
        ELatestHighlight associated0;
        String str;
        boolean z;
        String str2;
        String str3;
        final qqc qqcVar;
        final qqc qqcVar2;
        final USChatViewModel uSChatViewModel2;
        ArrayList arrayList;
        qqc qqcVar3;
        qqc qqcVar4;
        qqc qqcVar5;
        final t85 t85Var;
        String str4;
        final qqc qqcVar6;
        final qqc qqcVar7;
        final qqc qqcVar8;
        jca jcaVar;
        ?? r5;
        jca jcaVar2;
        jca jcaVar3;
        ESportsTeam shortTeam;
        ESportsTeam longTeam;
        ESportsTeam team;
        final ClientChatMessage clientChatMessage = (ClientChatMessage) obj;
        if (clientChatMessage != null && (event = (uSChatViewModel = this.a).getEvent()) != null && (sportSlug = event.getSportSlug()) != null && sportSlug.isSoccer()) {
            if (System.currentTimeMillis() - clientChatMessage.getCreatedAt().getTime() > RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                return Unit.INSTANCE;
            }
            ClientChatMessageContentType content = clientChatMessage.getContent();
            if (content instanceof ClientChatMessageContentType.PlayByPlayCase) {
                playByPlayCase = (ClientChatMessageContentType.PlayByPlayCase) content;
            } else {
                playByPlayCase = null;
            }
            if (playByPlayCase != null && (associated0 = playByPlayCase.getAssociated0()) != null) {
                EUserPosition position = uSChatViewModel.getPosition();
                if (position != null && (team = position.getTeam()) != null) {
                    str = team.getTeamId();
                } else {
                    str = null;
                }
                List list = pm3.a;
                String type = associated0.getType();
                if (uSChatViewModel.getPosition() != null) {
                    z = true;
                } else {
                    z = false;
                }
                String teamId = associated0.getTeamId();
                List<String> list2 = pm3.b;
                List list3 = pm3.a;
                type.getClass();
                if (Intrinsics.areEqual(type, "goal")) {
                    if (str != null) {
                        if (teamId != null && Intrinsics.areEqual(teamId, str)) {
                            list2 = list3;
                        }
                    } else if (z) {
                        list2 = CollectionsKt.i0(CollectionsKt.D0(2, list3), CollectionsKt.D0(2, list2));
                    }
                    if (list2 != null) {
                        return Unit.INSTANCE;
                    }
                    EEvent.SportsGame.TeamsPair teamsPair = this.b;
                    if (teamsPair != null && (longTeam = teamsPair.getLongTeam()) != null) {
                        str2 = longTeam.getTeamId();
                    } else {
                        str2 = null;
                    }
                    if (teamsPair != null && (shortTeam = teamsPair.getShortTeam()) != null) {
                        str3 = shortTeam.getTeamId();
                    } else {
                        str3 = null;
                    }
                    final USChatViewModel uSChatViewModel3 = this.a;
                    t85 t85Var2 = this.i;
                    final qqc qqcVar9 = this.r;
                    final dpc dpcVar = this.l;
                    qqc qqcVar10 = this.q;
                    final qqc qqcVar11 = this.m;
                    final dpc dpcVar2 = this.k;
                    qqc qqcVar12 = this.p;
                    qqc qqcVar13 = this.s;
                    final qqc qqcVar14 = this.n;
                    boolean z2 = 2;
                    final qqc qqcVar15 = this.o;
                    qqc qqcVar16 = qqcVar12;
                    String str5 = this.c;
                    String str6 = this.d;
                    final qqc qqcVar17 = qqcVar13;
                    final sm3 sm3Var = this.e;
                    final Set set = this.f;
                    final qqc qqcVar18 = this.g;
                    final qqc qqcVar19 = this.h;
                    final t85 t85Var3 = t85Var2;
                    final qqc qqcVar20 = this.j;
                    final qqc qqcVar21 = this.t;
                    final qqc qqcVar22 = this.u;
                    if (str != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (final String str7 : list2) {
                            ArrayList arrayList3 = arrayList2;
                            final ClientChatBattleSide clientChatBattleSide = null;
                            final t85 t85Var4 = t85Var3;
                            boolean z3 = z2;
                            final qqc qqcVar23 = qqcVar16;
                            final qqc qqcVar24 = qqcVar10;
                            km3 km3Var = new km3(str7, new Function0() { // from class: wm3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ClientChatBattleSide clientChatBattleSide2 = ClientChatBattleSide.this;
                                    USChatViewModel uSChatViewModel4 = uSChatViewModel3;
                                    if (clientChatBattleSide2 == null) {
                                        clientChatBattleSide2 = dn3.i(uSChatViewModel4);
                                    }
                                    sm3 sm3Var2 = sm3Var;
                                    String str8 = str7;
                                    sm3Var2.a(str8, clientChatBattleSide2, 1, null);
                                    ClientChatMessage clientChatMessage2 = clientChatMessage;
                                    ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction(str8, clientChatBattleSide2, clientChatMessage2.getId2(), 1);
                                    qqc qqcVar25 = qqcVar18;
                                    qqc qqcVar26 = qqcVar19;
                                    t85 t85Var5 = t85Var4;
                                    dn3.d(uSChatViewModel4, qqcVar25, qqcVar26, t85Var5, qqcVar20, clientChatBattleReaction);
                                    if (set.add(clientChatMessage2.getId2() + "|" + str8)) {
                                        List<ClientChatMessage.GroupedReaction> groupedReactions = clientChatMessage2.getGroupedReactions();
                                        if (!(groupedReactions instanceof Collection) || !groupedReactions.isEmpty()) {
                                            for (ClientChatMessage.GroupedReaction groupedReaction : groupedReactions) {
                                                if (Intrinsics.areEqual(groupedReaction.getEmoji(), str8) && groupedReaction.getCurrentUserReacted()) {
                                                    break;
                                                }
                                            }
                                        }
                                        uSChatViewModel4.addBattleReaction(ClientChatMessageReaction.ReactionContent.Companion.emoji(str8), clientChatMessage2);
                                    }
                                    dpc dpcVar3 = dpcVar2;
                                    dpc dpcVar4 = dpcVar;
                                    qqc qqcVar27 = qqcVar11;
                                    dn3.e(t85Var5, dpcVar3, dpcVar4, qqcVar27);
                                    dn3.f(t85Var5, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar27, qqcVar23, qqcVar24, qqcVar9, qqcVar17, uSChatViewModel4);
                                    return Unit.INSTANCE;
                                }
                            });
                            arrayList2 = arrayList3;
                            arrayList2.add(km3Var);
                            qqcVar10 = qqcVar24;
                            str = str;
                            qqcVar22 = qqcVar22;
                            str5 = str5;
                            t85Var3 = t85Var4;
                            qqcVar16 = qqcVar23;
                            z2 = z3;
                        }
                        final String str8 = str;
                        final qqc qqcVar25 = qqcVar16;
                        String str9 = str5;
                        t85 t85Var5 = t85Var3;
                        final qqc qqcVar26 = qqcVar22;
                        final qqc qqcVar27 = qqcVar10;
                        final ClientChatBattleSide i = dn3.i(uSChatViewModel3);
                        if (!Intrinsics.areEqual(i.getRawValue(), "home")) {
                            str9 = str6;
                        }
                        int size = (arrayList2.size() + 1) / 2;
                        t85Var = t85Var5;
                        ?? r0 = new Function0() { // from class: vm3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                qqc qqcVar28 = qqcVar21;
                                qqc qqcVar29 = qqcVar26;
                                ClientChatBattleSide clientChatBattleSide2 = ClientChatBattleSide.this;
                                Bitmap c = dn3.c(qqcVar28, qqcVar29, clientChatBattleSide2);
                                if (c != null) {
                                    sm3Var.a("", clientChatBattleSide2, 1, c);
                                }
                                ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction("team:".concat(str8), clientChatBattleSide2, clientChatMessage.getId2(), 1);
                                USChatViewModel uSChatViewModel4 = uSChatViewModel3;
                                qqc qqcVar30 = qqcVar18;
                                qqc qqcVar31 = qqcVar19;
                                t85 t85Var6 = t85Var;
                                dn3.d(uSChatViewModel4, qqcVar30, qqcVar31, t85Var6, qqcVar20, clientChatBattleReaction);
                                dpc dpcVar3 = dpcVar2;
                                dpc dpcVar4 = dpcVar;
                                qqc qqcVar32 = qqcVar11;
                                dn3.e(t85Var6, dpcVar3, dpcVar4, qqcVar32);
                                dn3.f(t85Var6, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar32, qqcVar25, qqcVar27, qqcVar9, qqcVar17, uSChatViewModel4);
                                return Unit.INSTANCE;
                            }
                        };
                        dpcVar2 = dpcVar2;
                        dpcVar = dpcVar;
                        qqcVar2 = qqcVar11;
                        qqcVar14 = qqcVar14;
                        qqcVar15 = qqcVar15;
                        qqcVar6 = qqcVar25;
                        qqcVar = qqcVar27;
                        qqcVar7 = qqcVar9;
                        qqcVar8 = qqcVar17;
                        lm3 lm3Var = new lm3(str9, r0);
                        arrayList = arrayList2;
                        arrayList.add(size, lm3Var);
                        uSChatViewModel2 = uSChatViewModel3;
                    } else {
                        final qqc qqcVar28 = qqcVar16;
                        final qqc qqcVar29 = qqcVar9;
                        qqcVar = qqcVar10;
                        qqcVar2 = qqcVar11;
                        if (str2 != null && str3 != null) {
                            String str10 = (String) CollectionsKt.firstOrNull(list2);
                            if (str10 == null) {
                                str10 = "🎉";
                            }
                            final String str11 = str10;
                            String str12 = (String) CollectionsKt.S(list2);
                            if (str12 == null) {
                                str4 = str11;
                            } else {
                                str4 = str12;
                            }
                            final ClientChatBattleSide clientChatBattleSide2 = ClientChatBattleSide.home;
                            km3 km3Var2 = new km3(str11, new Function0() { // from class: wm3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ClientChatBattleSide clientChatBattleSide22 = ClientChatBattleSide.this;
                                    USChatViewModel uSChatViewModel4 = uSChatViewModel3;
                                    if (clientChatBattleSide22 == null) {
                                        clientChatBattleSide22 = dn3.i(uSChatViewModel4);
                                    }
                                    sm3 sm3Var2 = sm3Var;
                                    String str82 = str11;
                                    sm3Var2.a(str82, clientChatBattleSide22, 1, null);
                                    ClientChatMessage clientChatMessage2 = clientChatMessage;
                                    ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction(str82, clientChatBattleSide22, clientChatMessage2.getId2(), 1);
                                    qqc qqcVar252 = qqcVar18;
                                    qqc qqcVar262 = qqcVar19;
                                    t85 t85Var52 = t85Var3;
                                    dn3.d(uSChatViewModel4, qqcVar252, qqcVar262, t85Var52, qqcVar20, clientChatBattleReaction);
                                    if (set.add(clientChatMessage2.getId2() + "|" + str82)) {
                                        List<ClientChatMessage.GroupedReaction> groupedReactions = clientChatMessage2.getGroupedReactions();
                                        if (!(groupedReactions instanceof Collection) || !groupedReactions.isEmpty()) {
                                            for (ClientChatMessage.GroupedReaction groupedReaction : groupedReactions) {
                                                if (Intrinsics.areEqual(groupedReaction.getEmoji(), str82) && groupedReaction.getCurrentUserReacted()) {
                                                    break;
                                                }
                                            }
                                        }
                                        uSChatViewModel4.addBattleReaction(ClientChatMessageReaction.ReactionContent.Companion.emoji(str82), clientChatMessage2);
                                    }
                                    dpc dpcVar3 = dpcVar2;
                                    dpc dpcVar4 = dpcVar;
                                    qqc qqcVar272 = qqcVar2;
                                    dn3.e(t85Var52, dpcVar3, dpcVar4, qqcVar272);
                                    dn3.f(t85Var52, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar272, qqcVar28, qqcVar, qqcVar29, qqcVar17, uSChatViewModel4);
                                    return Unit.INSTANCE;
                                }
                            });
                            final String str13 = str2;
                            lm3 lm3Var2 = new lm3(str5, new Function0() { // from class: vm3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    qqc qqcVar282 = qqcVar21;
                                    qqc qqcVar292 = qqcVar22;
                                    ClientChatBattleSide clientChatBattleSide22 = ClientChatBattleSide.this;
                                    Bitmap c = dn3.c(qqcVar282, qqcVar292, clientChatBattleSide22);
                                    if (c != null) {
                                        sm3Var.a("", clientChatBattleSide22, 1, c);
                                    }
                                    ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction("team:".concat(str13), clientChatBattleSide22, clientChatMessage.getId2(), 1);
                                    USChatViewModel uSChatViewModel4 = uSChatViewModel3;
                                    qqc qqcVar30 = qqcVar18;
                                    qqc qqcVar31 = qqcVar19;
                                    t85 t85Var6 = t85Var3;
                                    dn3.d(uSChatViewModel4, qqcVar30, qqcVar31, t85Var6, qqcVar20, clientChatBattleReaction);
                                    dpc dpcVar3 = dpcVar2;
                                    dpc dpcVar4 = dpcVar;
                                    qqc qqcVar32 = qqcVar2;
                                    dn3.e(t85Var6, dpcVar3, dpcVar4, qqcVar32);
                                    dn3.f(t85Var6, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar32, qqcVar28, qqcVar, qqcVar29, qqcVar17, uSChatViewModel4);
                                    return Unit.INSTANCE;
                                }
                            });
                            final ClientChatBattleSide clientChatBattleSide3 = ClientChatBattleSide.away;
                            final String str14 = str3;
                            ?? r02 = new Function0() { // from class: vm3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    qqc qqcVar282 = qqcVar21;
                                    qqc qqcVar292 = qqcVar22;
                                    ClientChatBattleSide clientChatBattleSide22 = ClientChatBattleSide.this;
                                    Bitmap c = dn3.c(qqcVar282, qqcVar292, clientChatBattleSide22);
                                    if (c != null) {
                                        sm3Var.a("", clientChatBattleSide22, 1, c);
                                    }
                                    ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction("team:".concat(str14), clientChatBattleSide22, clientChatMessage.getId2(), 1);
                                    USChatViewModel uSChatViewModel4 = uSChatViewModel3;
                                    qqc qqcVar30 = qqcVar18;
                                    qqc qqcVar31 = qqcVar19;
                                    t85 t85Var6 = t85Var3;
                                    dn3.d(uSChatViewModel4, qqcVar30, qqcVar31, t85Var6, qqcVar20, clientChatBattleReaction);
                                    dpc dpcVar3 = dpcVar2;
                                    dpc dpcVar4 = dpcVar;
                                    qqc qqcVar32 = qqcVar2;
                                    dn3.e(t85Var6, dpcVar3, dpcVar4, qqcVar32);
                                    dn3.f(t85Var6, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar32, qqcVar28, qqcVar, qqcVar29, qqcVar17, uSChatViewModel4);
                                    return Unit.INSTANCE;
                                }
                            };
                            dpcVar2 = dpcVar2;
                            dpcVar = dpcVar;
                            qqcVar2 = qqcVar2;
                            qqcVar14 = qqcVar14;
                            qqcVar15 = qqcVar15;
                            qqcVar6 = qqcVar28;
                            qqcVar = qqcVar;
                            qqcVar7 = qqcVar29;
                            qqcVar8 = qqcVar17;
                            lm3 lm3Var3 = new lm3(str6, r02);
                            uSChatViewModel2 = uSChatViewModel3;
                            final String str15 = str4;
                            ?? r03 = new Function0() { // from class: wm3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ClientChatBattleSide clientChatBattleSide22 = ClientChatBattleSide.this;
                                    USChatViewModel uSChatViewModel4 = uSChatViewModel2;
                                    if (clientChatBattleSide22 == null) {
                                        clientChatBattleSide22 = dn3.i(uSChatViewModel4);
                                    }
                                    sm3 sm3Var2 = sm3Var;
                                    String str82 = str15;
                                    sm3Var2.a(str82, clientChatBattleSide22, 1, null);
                                    ClientChatMessage clientChatMessage2 = clientChatMessage;
                                    ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction(str82, clientChatBattleSide22, clientChatMessage2.getId2(), 1);
                                    qqc qqcVar252 = qqcVar18;
                                    qqc qqcVar262 = qqcVar19;
                                    t85 t85Var52 = t85Var3;
                                    dn3.d(uSChatViewModel4, qqcVar252, qqcVar262, t85Var52, qqcVar20, clientChatBattleReaction);
                                    if (set.add(clientChatMessage2.getId2() + "|" + str82)) {
                                        List<ClientChatMessage.GroupedReaction> groupedReactions = clientChatMessage2.getGroupedReactions();
                                        if (!(groupedReactions instanceof Collection) || !groupedReactions.isEmpty()) {
                                            for (ClientChatMessage.GroupedReaction groupedReaction : groupedReactions) {
                                                if (Intrinsics.areEqual(groupedReaction.getEmoji(), str82) && groupedReaction.getCurrentUserReacted()) {
                                                    break;
                                                }
                                            }
                                        }
                                        uSChatViewModel4.addBattleReaction(ClientChatMessageReaction.ReactionContent.Companion.emoji(str82), clientChatMessage2);
                                    }
                                    dpc dpcVar3 = dpcVar2;
                                    dpc dpcVar4 = dpcVar;
                                    qqc qqcVar272 = qqcVar2;
                                    dn3.e(t85Var52, dpcVar3, dpcVar4, qqcVar272);
                                    dn3.f(t85Var52, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar272, qqcVar6, qqcVar, qqcVar7, qqcVar8, uSChatViewModel4);
                                    return Unit.INSTANCE;
                                }
                            };
                            t85Var = t85Var3;
                            arrayList = CollectionsKt.g0(km3Var2, lm3Var2, lm3Var3, new km3(str15, r03));
                        } else {
                            uSChatViewModel2 = uSChatViewModel3;
                            final qqc qqcVar30 = qqcVar18;
                            final qqc qqcVar31 = qqcVar19;
                            ArrayList arrayList4 = new ArrayList();
                            for (final String str16 : list2) {
                                ArrayList arrayList5 = arrayList4;
                                final ClientChatBattleSide clientChatBattleSide4 = null;
                                final t85 t85Var6 = t85Var3;
                                arrayList5.add(new km3(str16, new Function0() { // from class: wm3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ClientChatBattleSide clientChatBattleSide22 = ClientChatBattleSide.this;
                                        USChatViewModel uSChatViewModel4 = uSChatViewModel2;
                                        if (clientChatBattleSide22 == null) {
                                            clientChatBattleSide22 = dn3.i(uSChatViewModel4);
                                        }
                                        sm3 sm3Var2 = sm3Var;
                                        String str82 = str16;
                                        sm3Var2.a(str82, clientChatBattleSide22, 1, null);
                                        ClientChatMessage clientChatMessage2 = clientChatMessage;
                                        ClientChatBattleReaction clientChatBattleReaction = new ClientChatBattleReaction(str82, clientChatBattleSide22, clientChatMessage2.getId2(), 1);
                                        qqc qqcVar252 = qqcVar30;
                                        qqc qqcVar262 = qqcVar31;
                                        t85 t85Var52 = t85Var6;
                                        dn3.d(uSChatViewModel4, qqcVar252, qqcVar262, t85Var52, qqcVar20, clientChatBattleReaction);
                                        if (set.add(clientChatMessage2.getId2() + "|" + str82)) {
                                            List<ClientChatMessage.GroupedReaction> groupedReactions = clientChatMessage2.getGroupedReactions();
                                            if (!(groupedReactions instanceof Collection) || !groupedReactions.isEmpty()) {
                                                for (ClientChatMessage.GroupedReaction groupedReaction : groupedReactions) {
                                                    if (Intrinsics.areEqual(groupedReaction.getEmoji(), str82) && groupedReaction.getCurrentUserReacted()) {
                                                        break;
                                                    }
                                                }
                                            }
                                            uSChatViewModel4.addBattleReaction(ClientChatMessageReaction.ReactionContent.Companion.emoji(str82), clientChatMessage2);
                                        }
                                        dpc dpcVar3 = dpcVar2;
                                        dpc dpcVar4 = dpcVar;
                                        qqc qqcVar272 = qqcVar2;
                                        dn3.e(t85Var52, dpcVar3, dpcVar4, qqcVar272);
                                        dn3.f(t85Var52, dpcVar4, dpcVar3, qqcVar14, qqcVar15, qqcVar272, qqcVar28, qqcVar, qqcVar29, qqcVar17, uSChatViewModel4);
                                        return Unit.INSTANCE;
                                    }
                                }));
                                qqcVar28 = qqcVar28;
                                sm3Var = sm3Var;
                                qqcVar30 = qqcVar30;
                                qqcVar31 = qqcVar31;
                                qqcVar17 = qqcVar17;
                                set = set;
                                t85Var3 = t85Var6;
                                qqcVar20 = qqcVar20;
                                qqcVar29 = qqcVar29;
                                arrayList4 = arrayList5;
                            }
                            arrayList = arrayList4;
                            qqcVar3 = qqcVar28;
                            qqcVar4 = qqcVar29;
                            qqcVar5 = qqcVar17;
                            t85Var = t85Var3;
                            if (((Boolean) qqcVar4.getValue()).booleanValue()) {
                                hvd hvdVar = (hvd) dpcVar;
                                if (hvdVar.y() > 0) {
                                    uSChatViewModel2.recordEmojiFlurryStreak(hvdVar.y());
                                }
                            }
                            jcaVar = (jca) qqcVar.getValue();
                            if (jcaVar == null) {
                                ica icaVar = jca.C0;
                                r5 = 0;
                                jcaVar.e(null);
                            } else {
                                r5 = 0;
                            }
                            jcaVar2 = (jca) qqcVar2.getValue();
                            if (jcaVar2 != 0) {
                                ica icaVar2 = jca.C0;
                                jcaVar2.e(r5);
                            }
                            ((hvd) dpcVar2).z(0);
                            ((hvd) dpcVar).z(0);
                            qqcVar3.setValue(r5);
                            qqcVar5.setValue(arrayList);
                            qqcVar4.setValue(Boolean.TRUE);
                            qqc qqcVar32 = qqcVar4;
                            qqc qqcVar33 = qqcVar3;
                            qqc qqcVar34 = qqcVar5;
                            t85 t85Var7 = t85Var;
                            dn3.f(t85Var7, dpcVar, dpcVar2, qqcVar14, qqcVar15, qqcVar2, qqcVar33, qqcVar, qqcVar32, qqcVar34, uSChatViewModel2);
                            jcaVar3 = (jca) qqcVar15.getValue();
                            if (jcaVar3 != 0) {
                                jcaVar3.e(r5);
                            }
                            qqcVar15.setValue(coc.c(t85Var7, r5, r5, new bn3(uSChatViewModel2, t85Var7, qqcVar14, qqcVar15, qqcVar2, dpcVar, qqcVar33, qqcVar, qqcVar32, qqcVar34, dpcVar2, null, 0), 3));
                            return Unit.INSTANCE;
                        }
                    }
                    qqcVar3 = qqcVar6;
                    qqcVar4 = qqcVar7;
                    qqcVar5 = qqcVar8;
                    if (((Boolean) qqcVar4.getValue()).booleanValue()) {
                    }
                    jcaVar = (jca) qqcVar.getValue();
                    if (jcaVar == null) {
                    }
                    jcaVar2 = (jca) qqcVar2.getValue();
                    if (jcaVar2 != 0) {
                    }
                    ((hvd) dpcVar2).z(0);
                    ((hvd) dpcVar).z(0);
                    qqcVar3.setValue(r5);
                    qqcVar5.setValue(arrayList);
                    qqcVar4.setValue(Boolean.TRUE);
                    qqc qqcVar322 = qqcVar4;
                    qqc qqcVar332 = qqcVar3;
                    qqc qqcVar342 = qqcVar5;
                    t85 t85Var72 = t85Var;
                    dn3.f(t85Var72, dpcVar, dpcVar2, qqcVar14, qqcVar15, qqcVar2, qqcVar332, qqcVar, qqcVar322, qqcVar342, uSChatViewModel2);
                    jcaVar3 = (jca) qqcVar15.getValue();
                    if (jcaVar3 != 0) {
                    }
                    qqcVar15.setValue(coc.c(t85Var72, r5, r5, new bn3(uSChatViewModel2, t85Var72, qqcVar14, qqcVar15, qqcVar2, dpcVar, qqcVar332, qqcVar, qqcVar322, qqcVar342, dpcVar2, null, 0), 3));
                    return Unit.INSTANCE;
                }
                list2 = null;
                if (list2 != null) {
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            return Unit.INSTANCE;
        }
    }
}
