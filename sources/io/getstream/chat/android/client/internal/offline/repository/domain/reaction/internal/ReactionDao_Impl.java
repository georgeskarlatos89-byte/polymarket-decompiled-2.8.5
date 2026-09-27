package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import defpackage.bof;
import defpackage.bxn;
import defpackage.cf3;
import defpackage.cof;
import defpackage.cwe;
import defpackage.dof;
import defpackage.eof;
import defpackage.es6;
import defpackage.fcg;
import defpackage.fof;
import defpackage.hof;
import defpackage.j9g;
import defpackage.jg7;
import defpackage.lcg;
import defpackage.mg7;
import defpackage.mhi;
import defpackage.ok0;
import defpackage.qu7;
import defpackage.rql;
import defpackage.sv6;
import defpackage.u85;
import defpackage.vtn;
import defpackage.ys5;
import defpackage.zhf;
import io.getstream.chat.android.models.SyncStatus;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J*\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b \u0010!J(\u0010$\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bH\u0096@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;", "Lbof;", "Lj9g;", "__db", "<init>", "(Lj9g;)V", "Lhof;", "reactionEntity", "", "insert", "(Lhof;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "selectReactionById", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", "selectReactionsByIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "limit", "selectIdsSyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectSyncStatus", "", "reactionType", "messageId", "userId", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUserReactionsToMessage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "deletedAt", "setDeleteAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj9g;", "Lmg7;", "__insertAdapterOfReactionEntity", "Lmg7;", "Lys5;", "__dateConverter", "Lys5;", "Lqu7;", "__extraDataConverter", "Lqu7;", "Lmhi;", "__syncStatusConverter", "Lmhi;", "Ljg7;", "__deleteAdapterOfReactionEntity", "Ljg7;", "Companion", "fof", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReactionDao_Impl implements bof {
    public static final fof Companion = new Object();
    private final ys5 __dateConverter;
    private final j9g __db;
    private final jg7 __deleteAdapterOfReactionEntity;
    private final qu7 __extraDataConverter;
    private final mg7 __insertAdapterOfReactionEntity;
    private final mhi __syncStatusConverter;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ys5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mhi] */
    public ReactionDao_Impl(j9g j9gVar) {
        j9gVar.getClass();
        this.__dateConverter = new Object();
        this.__extraDataConverter = new qu7();
        this.__syncStatusConverter = new Object();
        this.__db = j9gVar;
        this.__insertAdapterOfReactionEntity = new cf3(this, 5);
        this.__deleteAdapterOfReactionEntity = new eof(0);
    }

    public static /* synthetic */ Unit a(ReactionDao_Impl reactionDao_Impl, hof hofVar, fcg fcgVar) {
        return delete$lambda$1(reactionDao_Impl, hofVar, fcgVar);
    }

    public static final /* synthetic */ ys5 access$get__dateConverter$p(ReactionDao_Impl reactionDao_Impl) {
        return reactionDao_Impl.__dateConverter;
    }

    public static final /* synthetic */ qu7 access$get__extraDataConverter$p(ReactionDao_Impl reactionDao_Impl) {
        return reactionDao_Impl.__extraDataConverter;
    }

    public static final /* synthetic */ mhi access$get__syncStatusConverter$p(ReactionDao_Impl reactionDao_Impl) {
        return reactionDao_Impl.__syncStatusConverter;
    }

    public static /* synthetic */ Unit b(ReactionDao_Impl reactionDao_Impl, Date date, String str, String str2, fcg fcgVar) {
        return setDeleteAt$lambda$8("UPDATE stream_chat_reaction SET deletedAt = ? WHERE userId = ? AND messageId = ?", reactionDao_Impl, date, str, str2, fcgVar);
    }

    public static /* synthetic */ Unit c(fcg fcgVar) {
        return deleteAll$lambda$9("DELETE FROM stream_chat_reaction", fcgVar);
    }

    public static /* synthetic */ List d(ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        return selectIdsSyncStatus$lambda$4("SELECT id FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", reactionDao_Impl, syncStatus, i, fcgVar);
    }

    private static final Unit delete$lambda$1(ReactionDao_Impl reactionDao_Impl, hof hofVar, fcg fcgVar) {
        fcgVar.getClass();
        reactionDao_Impl.__deleteAdapterOfReactionEntity.c(fcgVar, hofVar);
        return Unit.INSTANCE;
    }

    private static final Unit deleteAll$lambda$9(String str, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    public static /* synthetic */ Unit e(ReactionDao_Impl reactionDao_Impl, hof hofVar, fcg fcgVar) {
        return insert$lambda$0(reactionDao_Impl, hofVar, fcgVar);
    }

    public static /* synthetic */ List f(String str, List list, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        return selectReactionsByIds$lambda$3(str, list, reactionDao_Impl, fcgVar);
    }

    public static /* synthetic */ hof g(int i, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        return selectReactionById$lambda$2("SELECT * FROM stream_chat_reaction WHERE id = ?", i, reactionDao_Impl, fcgVar);
    }

    public static /* synthetic */ hof h(String str, String str2, String str3, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        return selectUserReactionToMessage$lambda$6("SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.type = ? AND stream_chat_reaction.messageid = ? AND userId = ?", str, str2, str3, reactionDao_Impl, fcgVar);
    }

    public static /* synthetic */ List i(String str, String str2, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        return selectUserReactionsToMessage$lambda$7("SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.messageid = ? AND userId = ?", str, str2, reactionDao_Impl, fcgVar);
    }

    private static final Unit insert$lambda$0(ReactionDao_Impl reactionDao_Impl, hof hofVar, fcg fcgVar) {
        fcgVar.getClass();
        reactionDao_Impl.__insertAdapterOfReactionEntity.d(fcgVar, hofVar);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List j(ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        return selectSyncStatus$lambda$5("SELECT * FROM stream_chat_reaction WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", reactionDao_Impl, syncStatus, i, fcgVar);
    }

    private static final List selectIdsSyncStatus$lambda$4(String str, ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            reactionDao_Impl.__syncStatusConverter.getClass();
            m1.l(1, mhi.b(syncStatus));
            m1.l(2, i);
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                arrayList.add(Integer.valueOf((int) m1.getLong(0)));
            }
            return arrayList;
        } finally {
            m1.close();
        }
    }

    private static final hof selectReactionById$lambda$2(String str, int i, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        boolean z;
        boolean z2;
        String N0;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.l(1, i);
            int a = bxn.a(m1, "messageId");
            int a2 = bxn.a(m1, "userId");
            int a3 = bxn.a(m1, "type");
            int a4 = bxn.a(m1, "score");
            int a5 = bxn.a(m1, "createdAt");
            int a6 = bxn.a(m1, "createdLocallyAt");
            int a7 = bxn.a(m1, "updatedAt");
            int a8 = bxn.a(m1, "deletedAt");
            int a9 = bxn.a(m1, "enforceUnique");
            int a10 = bxn.a(m1, "skipPush");
            int a11 = bxn.a(m1, "emojiCode");
            int a12 = bxn.a(m1, "extraData");
            int a13 = bxn.a(m1, "syncStatus");
            int a14 = bxn.a(m1, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            hof hofVar = null;
            String N02 = null;
            if (m1.j1()) {
                String N03 = m1.N0(a);
                String N04 = m1.N0(a2);
                String N05 = m1.N0(a3);
                int i2 = (int) m1.getLong(a4);
                if (m1.isNull(a5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a5));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a6));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                if (m1.isNull(a7)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(m1.getLong(a7));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b3 = ys5.b(valueOf3);
                if (m1.isNull(a8)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(m1.getLong(a8));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b4 = ys5.b(valueOf4);
                if (((int) m1.getLong(a9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) m1.getLong(a10)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m1.isNull(a11)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a11);
                }
                if (!m1.isNull(a12)) {
                    N02 = m1.N0(a12);
                }
                Map b5 = reactionDao_Impl.__extraDataConverter.b(N02);
                if (b5 != null) {
                    int i3 = (int) m1.getLong(a13);
                    reactionDao_Impl.__syncStatusConverter.getClass();
                    hof hofVar2 = new hof(N03, N04, N05, i2, b, b2, b3, b4, z, z2, N0, b5, mhi.a(i3));
                    hofVar2.n = (int) m1.getLong(a14);
                    hofVar = hofVar2;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
            }
            m1.close();
            return hofVar;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final List selectReactionsByIds$lambda$3(String str, List list, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        boolean z;
        boolean z2;
        String N0;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                m1.l(i, ((Number) it.next()).intValue());
                i++;
            }
            int a = bxn.a(m1, "messageId");
            int a2 = bxn.a(m1, "userId");
            int a3 = bxn.a(m1, "type");
            int a4 = bxn.a(m1, "score");
            int a5 = bxn.a(m1, "createdAt");
            int a6 = bxn.a(m1, "createdLocallyAt");
            int a7 = bxn.a(m1, "updatedAt");
            int a8 = bxn.a(m1, "deletedAt");
            int a9 = bxn.a(m1, "enforceUnique");
            int a10 = bxn.a(m1, "skipPush");
            int a11 = bxn.a(m1, "emojiCode");
            int a12 = bxn.a(m1, "extraData");
            int a13 = bxn.a(m1, "syncStatus");
            int a14 = bxn.a(m1, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                String N02 = m1.N0(a);
                String N03 = m1.N0(a2);
                String N04 = m1.N0(a3);
                int i2 = a2;
                int i3 = a3;
                int i4 = (int) m1.getLong(a4);
                String str2 = null;
                if (m1.isNull(a5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a5));
                }
                int i5 = a;
                reactionDao_Impl.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a6));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                if (m1.isNull(a7)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(m1.getLong(a7));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b3 = ys5.b(valueOf3);
                if (m1.isNull(a8)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(m1.getLong(a8));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b4 = ys5.b(valueOf4);
                if (((int) m1.getLong(a9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) m1.getLong(a10)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m1.isNull(a11)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a11);
                }
                if (!m1.isNull(a12)) {
                    str2 = m1.N0(a12);
                }
                Map b5 = reactionDao_Impl.__extraDataConverter.b(str2);
                if (b5 != null) {
                    int i6 = (int) m1.getLong(a13);
                    reactionDao_Impl.__syncStatusConverter.getClass();
                    hof hofVar = new hof(N02, N03, N04, i4, b, b2, b3, b4, z, z2, N0, b5, mhi.a(i6));
                    int i7 = a14;
                    hofVar.n = (int) m1.getLong(i7);
                    arrayList.add(hofVar);
                    a4 = a4;
                    a14 = i7;
                    a3 = i3;
                    a = i5;
                    a2 = i2;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
            }
            m1.close();
            return arrayList;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final List selectSyncStatus$lambda$5(String str, ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        boolean z;
        boolean z2;
        String N0;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            reactionDao_Impl.__syncStatusConverter.getClass();
            m1.l(1, mhi.b(syncStatus));
            m1.l(2, i);
            int a = bxn.a(m1, "messageId");
            int a2 = bxn.a(m1, "userId");
            int a3 = bxn.a(m1, "type");
            int a4 = bxn.a(m1, "score");
            int a5 = bxn.a(m1, "createdAt");
            int a6 = bxn.a(m1, "createdLocallyAt");
            int a7 = bxn.a(m1, "updatedAt");
            int a8 = bxn.a(m1, "deletedAt");
            int a9 = bxn.a(m1, "enforceUnique");
            int a10 = bxn.a(m1, "skipPush");
            int a11 = bxn.a(m1, "emojiCode");
            int a12 = bxn.a(m1, "extraData");
            int a13 = bxn.a(m1, "syncStatus");
            int a14 = bxn.a(m1, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                String N02 = m1.N0(a);
                String N03 = m1.N0(a2);
                String N04 = m1.N0(a3);
                int i2 = a;
                int i3 = a2;
                int i4 = (int) m1.getLong(a4);
                String str2 = null;
                if (m1.isNull(a5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a5));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a6));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                if (m1.isNull(a7)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(m1.getLong(a7));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b3 = ys5.b(valueOf3);
                if (m1.isNull(a8)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(m1.getLong(a8));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b4 = ys5.b(valueOf4);
                if (((int) m1.getLong(a9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList arrayList2 = arrayList;
                if (((int) m1.getLong(a10)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m1.isNull(a11)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a11);
                }
                if (!m1.isNull(a12)) {
                    str2 = m1.N0(a12);
                }
                Map b5 = reactionDao_Impl.__extraDataConverter.b(str2);
                if (b5 != null) {
                    int i5 = (int) m1.getLong(a13);
                    reactionDao_Impl.__syncStatusConverter.getClass();
                    hof hofVar = new hof(N02, N03, N04, i4, b, b2, b3, b4, z, z2, N0, b5, mhi.a(i5));
                    int i6 = a14;
                    hofVar.n = (int) m1.getLong(i6);
                    arrayList2.add(hofVar);
                    a3 = a3;
                    a2 = i3;
                    a14 = i6;
                    a4 = a4;
                    arrayList = arrayList2;
                    a = i2;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
            }
            ArrayList arrayList3 = arrayList;
            m1.close();
            return arrayList3;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final hof selectUserReactionToMessage$lambda$6(String str, String str2, String str3, String str4, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        boolean z;
        boolean z2;
        String N0;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.H(1, str2);
            m1.H(2, str3);
            m1.H(3, str4);
            int a = bxn.a(m1, "messageId");
            int a2 = bxn.a(m1, "userId");
            int a3 = bxn.a(m1, "type");
            int a4 = bxn.a(m1, "score");
            int a5 = bxn.a(m1, "createdAt");
            int a6 = bxn.a(m1, "createdLocallyAt");
            int a7 = bxn.a(m1, "updatedAt");
            int a8 = bxn.a(m1, "deletedAt");
            int a9 = bxn.a(m1, "enforceUnique");
            int a10 = bxn.a(m1, "skipPush");
            int a11 = bxn.a(m1, "emojiCode");
            int a12 = bxn.a(m1, "extraData");
            int a13 = bxn.a(m1, "syncStatus");
            int a14 = bxn.a(m1, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            hof hofVar = null;
            String N02 = null;
            if (m1.j1()) {
                String N03 = m1.N0(a);
                String N04 = m1.N0(a2);
                String N05 = m1.N0(a3);
                int i = (int) m1.getLong(a4);
                if (m1.isNull(a5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a5));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a6));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                if (m1.isNull(a7)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(m1.getLong(a7));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b3 = ys5.b(valueOf3);
                if (m1.isNull(a8)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(m1.getLong(a8));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b4 = ys5.b(valueOf4);
                if (((int) m1.getLong(a9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (((int) m1.getLong(a10)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m1.isNull(a11)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a11);
                }
                if (!m1.isNull(a12)) {
                    N02 = m1.N0(a12);
                }
                Map b5 = reactionDao_Impl.__extraDataConverter.b(N02);
                if (b5 != null) {
                    int i2 = (int) m1.getLong(a13);
                    reactionDao_Impl.__syncStatusConverter.getClass();
                    hof hofVar2 = new hof(N03, N04, N05, i, b, b2, b3, b4, z, z2, N0, b5, mhi.a(i2));
                    hofVar2.n = (int) m1.getLong(a14);
                    hofVar = hofVar2;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
            }
            m1.close();
            return hofVar;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final List selectUserReactionsToMessage$lambda$7(String str, String str2, String str3, ReactionDao_Impl reactionDao_Impl, fcg fcgVar) {
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        boolean z;
        boolean z2;
        String N0;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.H(1, str2);
            m1.H(2, str3);
            int a = bxn.a(m1, "messageId");
            int a2 = bxn.a(m1, "userId");
            int a3 = bxn.a(m1, "type");
            int a4 = bxn.a(m1, "score");
            int a5 = bxn.a(m1, "createdAt");
            int a6 = bxn.a(m1, "createdLocallyAt");
            int a7 = bxn.a(m1, "updatedAt");
            int a8 = bxn.a(m1, "deletedAt");
            int a9 = bxn.a(m1, "enforceUnique");
            int a10 = bxn.a(m1, "skipPush");
            int a11 = bxn.a(m1, "emojiCode");
            int a12 = bxn.a(m1, "extraData");
            int a13 = bxn.a(m1, "syncStatus");
            int a14 = bxn.a(m1, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                String N02 = m1.N0(a);
                String N03 = m1.N0(a2);
                String N04 = m1.N0(a3);
                int i = a;
                int i2 = a2;
                int i3 = (int) m1.getLong(a4);
                String str4 = null;
                if (m1.isNull(a5)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a5));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a6)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a6));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                if (m1.isNull(a7)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(m1.getLong(a7));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b3 = ys5.b(valueOf3);
                if (m1.isNull(a8)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(m1.getLong(a8));
                }
                reactionDao_Impl.__dateConverter.getClass();
                Date b4 = ys5.b(valueOf4);
                if (((int) m1.getLong(a9)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i4 = a3;
                if (((int) m1.getLong(a10)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m1.isNull(a11)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a11);
                }
                if (!m1.isNull(a12)) {
                    str4 = m1.N0(a12);
                }
                Map b5 = reactionDao_Impl.__extraDataConverter.b(str4);
                if (b5 != null) {
                    int i5 = (int) m1.getLong(a13);
                    reactionDao_Impl.__syncStatusConverter.getClass();
                    hof hofVar = new hof(N02, N03, N04, i3, b, b2, b3, b4, z, z2, N0, b5, mhi.a(i5));
                    int i6 = a14;
                    hofVar.n = (int) m1.getLong(i6);
                    arrayList.add(hofVar);
                    a4 = a4;
                    a2 = i2;
                    a14 = i6;
                    a5 = a5;
                    a3 = i4;
                    a = i;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
            }
            m1.close();
            return arrayList;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final Unit setDeleteAt$lambda$8(String str, ReactionDao_Impl reactionDao_Impl, Date date, String str2, String str3, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            reactionDao_Impl.__dateConverter.getClass();
            Long a = ys5.a(date);
            if (a == null) {
                m1.m(1);
            } else {
                m1.l(1, a.longValue());
            }
            m1.H(2, str2);
            m1.H(3, str3);
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    @Override // defpackage.bof
    public Object delete(hof hofVar, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new dof(this, hofVar, 1), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bof
    public Object deleteAll(Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new zhf(8), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bof
    public Object insert(hof hofVar, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new dof(this, hofVar, 0), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bof
    public Object selectIdsSyncStatus(SyncStatus syncStatus, int i, Continuation<? super List<Integer>> continuation) {
        return vtn.f(this.__db, true, false, new cof(this, syncStatus, i, 1), continuation);
    }

    @Override // defpackage.bof
    public Object selectReactionById(int i, Continuation<? super hof> continuation) {
        return vtn.f(this.__db, true, false, new ok0(i, this, 5), continuation);
    }

    public Object selectReactionsByIds(List<Integer> list, Continuation<? super List<hof>> continuation) {
        StringBuilder s = sv6.s("SELECT * FROM stream_chat_reaction WHERE id IN (");
        rql.b(list.size(), s);
        s.append(")");
        return vtn.f(this.__db, true, false, new es6(s.toString(), list, this, 22), continuation);
    }

    public Object selectSyncStatus(SyncStatus syncStatus, int i, Continuation<? super List<hof>> continuation) {
        return vtn.f(this.__db, true, false, new cof(this, syncStatus, i, 0), continuation);
    }

    @Override // defpackage.bof
    public Object selectUserReactionToMessage(String str, String str2, String str3, Continuation<? super hof> continuation) {
        return vtn.f(this.__db, true, false, new cwe(str, str2, str3, this), continuation);
    }

    public Object selectUserReactionsToMessage(String str, String str2, Continuation<? super List<hof>> continuation) {
        return vtn.f(this.__db, true, false, new es6(str, str2, this, 21), continuation);
    }

    @Override // defpackage.bof
    public Object setDeleteAt(String str, String str2, Date date, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new cwe(4, this, date, str, str2, false), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }
}
