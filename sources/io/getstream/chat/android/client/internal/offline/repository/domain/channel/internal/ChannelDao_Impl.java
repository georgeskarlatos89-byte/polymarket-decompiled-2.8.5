package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.bxn;
import defpackage.c0c;
import defpackage.cf3;
import defpackage.dd;
import defpackage.fcg;
import defpackage.gzg;
import defpackage.h7;
import defpackage.j9g;
import defpackage.k50;
import defpackage.l53;
import defpackage.lcg;
import defpackage.mg7;
import defpackage.mhi;
import defpackage.opb;
import defpackage.qu7;
import defpackage.rql;
import defpackage.sv6;
import defpackage.u85;
import defpackage.u8c;
import defpackage.uf3;
import defpackage.vf3;
import defpackage.vib;
import defpackage.vtn;
import defpackage.wf3;
import defpackage.x53;
import defpackage.xf3;
import defpackage.ys5;
import defpackage.zf3;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u001a\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001d\u0010\u001cJ \u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J(\u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b%\u0010&J \u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010'J\u0010\u0010(\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;", "Luf3;", "Lj9g;", "__db", "<init>", "(Lj9g;)V", "Lzf3;", "channelEntity", "", "insert", "(Lzf3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "channelEntities", "insertMany", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectAllCids", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "", "limit", "selectCidsBySyncNeeded", "(Lio/getstream/chat/android/models/SyncStatus;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectSyncNeeded", "cids", "select", "cid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Ljava/util/Date;", "deletedAt", "setDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHidden", "(Ljava/lang/String;ZLjava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "Lj9g;", "Lmg7;", "__insertAdapterOfChannelEntity", "Lmg7;", "Lvib;", "__listConverter", "Lvib;", "Lys5;", "__dateConverter", "Lys5;", "Lc0c;", "__mapConverter", "Lc0c;", "Lqu7;", "__extraDataConverter", "Lqu7;", "Lmhi;", "__syncStatusConverter", "Lmhi;", "Lgzg;", "__setConverter", "Lgzg;", "Lu8c;", "__memberConverter", "Lu8c;", "Lopb;", "__locationConverter", "Lopb;", "Companion", "xf3", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChannelDao_Impl implements uf3 {
    public static final xf3 Companion = new Object();
    private final ys5 __dateConverter;
    private final j9g __db;
    private final qu7 __extraDataConverter;
    private final mg7 __insertAdapterOfChannelEntity;
    private final vib __listConverter;
    private final opb __locationConverter;
    private final c0c __mapConverter;
    private final u8c __memberConverter;
    private final gzg __setConverter;
    private final mhi __syncStatusConverter;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ys5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mhi] */
    public ChannelDao_Impl(j9g j9gVar) {
        j9gVar.getClass();
        this.__listConverter = new vib();
        this.__dateConverter = new Object();
        this.__mapConverter = new c0c();
        this.__extraDataConverter = new qu7();
        this.__syncStatusConverter = new Object();
        this.__setConverter = new gzg();
        this.__memberConverter = new u8c();
        this.__locationConverter = new opb();
        this.__db = j9gVar;
        this.__insertAdapterOfChannelEntity = new cf3(this, 1);
    }

    public static /* synthetic */ List a(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        return selectCidsBySyncNeeded$lambda$3("SELECT cid FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", channelDao_Impl, syncStatus, i, fcgVar);
    }

    public static final /* synthetic */ ys5 access$get__dateConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__dateConverter;
    }

    public static final /* synthetic */ qu7 access$get__extraDataConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__extraDataConverter;
    }

    public static final /* synthetic */ vib access$get__listConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__listConverter;
    }

    public static final /* synthetic */ opb access$get__locationConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__locationConverter;
    }

    public static final /* synthetic */ c0c access$get__mapConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__mapConverter;
    }

    public static final /* synthetic */ u8c access$get__memberConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__memberConverter;
    }

    public static final /* synthetic */ gzg access$get__setConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__setConverter;
    }

    public static final /* synthetic */ mhi access$get__syncStatusConverter$p(ChannelDao_Impl channelDao_Impl) {
        return channelDao_Impl.__syncStatusConverter;
    }

    public static /* synthetic */ Unit b(fcg fcgVar, String str, boolean z) {
        return setHidden$lambda$16("UPDATE stream_chat_channel_state SET hidden = ? WHERE cid = ?", z, str, fcgVar);
    }

    public static /* synthetic */ Unit c(fcg fcgVar) {
        return deleteAll$lambda$17("DELETE FROM stream_chat_channel_state", fcgVar);
    }

    public static /* synthetic */ List d(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        return selectSyncNeeded$lambda$6("SELECT * FROM stream_chat_channel_state WHERE syncStatus = ? ORDER BY syncStatus ASC LIMIT ?", channelDao_Impl, syncStatus, i, fcgVar);
    }

    private static final Unit delete$lambda$13(String str, String str2, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.H(1, str2);
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final Unit deleteAll$lambda$17(String str, fcg fcgVar) {
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

    public static /* synthetic */ List e(String str, List list, ChannelDao_Impl channelDao_Impl, fcg fcgVar) {
        return select$lambda$9(str, list, channelDao_Impl, fcgVar);
    }

    public static /* synthetic */ List f(fcg fcgVar) {
        return selectAllCids$lambda$2("SELECT cid FROM stream_chat_channel_state", fcgVar);
    }

    public static /* synthetic */ Unit g(ChannelDao_Impl channelDao_Impl, List list, fcg fcgVar) {
        return insertMany$lambda$1(channelDao_Impl, list, fcgVar);
    }

    public static /* synthetic */ Unit h(boolean z, ChannelDao_Impl channelDao_Impl, Date date, String str, fcg fcgVar) {
        return setHidden$lambda$15("UPDATE stream_chat_channel_state SET hidden = ?, hideMessagesBefore = ? WHERE cid = ?", z, channelDao_Impl, date, str, fcgVar);
    }

    public static /* synthetic */ Unit i(ChannelDao_Impl channelDao_Impl, zf3 zf3Var, fcg fcgVar) {
        return insert$lambda$0(channelDao_Impl, zf3Var, fcgVar);
    }

    private static final Unit insert$lambda$0(ChannelDao_Impl channelDao_Impl, zf3 zf3Var, fcg fcgVar) {
        fcgVar.getClass();
        channelDao_Impl.__insertAdapterOfChannelEntity.d(fcgVar, zf3Var);
        return Unit.INSTANCE;
    }

    private static final Unit insertMany$lambda$1(ChannelDao_Impl channelDao_Impl, List list, fcg fcgVar) {
        fcgVar.getClass();
        channelDao_Impl.__insertAdapterOfChannelEntity.c(fcgVar, list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit j(ChannelDao_Impl channelDao_Impl, Date date, String str, fcg fcgVar) {
        return setDeletedAt$lambda$14("UPDATE stream_chat_channel_state SET deletedAt = ? WHERE cid = ?", channelDao_Impl, date, str, fcgVar);
    }

    public static /* synthetic */ Unit k(String str, fcg fcgVar) {
        return delete$lambda$13("DELETE from stream_chat_channel_state WHERE cid = ?", str, fcgVar);
    }

    public static /* synthetic */ zf3 l(String str, ChannelDao_Impl channelDao_Impl, fcg fcgVar) {
        return select$lambda$12("SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN (?)", str, channelDao_Impl, fcgVar);
    }

    private static final zf3 select$lambda$12(String str, String str2, ChannelDao_Impl channelDao_Impl, fcg fcgVar) {
        String N0;
        boolean z;
        boolean z2;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        Long valueOf3;
        Long valueOf4;
        String N02;
        String N03;
        String N04;
        Long valueOf5;
        String N05;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        String N06;
        String N07;
        String N08;
        String N09;
        boolean z3;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            if (str2 == null) {
                m1.m(1);
            } else {
                m1.H(1, str2);
            }
            int a = bxn.a(m1, "type");
            int a2 = bxn.a(m1, "channelId");
            int a3 = bxn.a(m1, Keys.KEY_NAME);
            int a4 = bxn.a(m1, "image");
            int a5 = bxn.a(m1, "cooldown");
            int a6 = bxn.a(m1, "createdByUserId");
            int a7 = bxn.a(m1, "filterTags");
            int a8 = bxn.a(m1, "frozen");
            int a9 = bxn.a(m1, "disabled");
            int a10 = bxn.a(m1, "blocked");
            int a11 = bxn.a(m1, "hidden");
            int a12 = bxn.a(m1, "hideMessagesBefore");
            int a13 = bxn.a(m1, "truncatedAt");
            int a14 = bxn.a(m1, "members");
            int a15 = bxn.a(m1, "memberCount");
            int a16 = bxn.a(m1, "watcherIds");
            int a17 = bxn.a(m1, "watcherCount");
            int a18 = bxn.a(m1, "reads");
            int a19 = bxn.a(m1, "lastMessageAt");
            int a20 = bxn.a(m1, "lastMessageId");
            int a21 = bxn.a(m1, "createdAt");
            int a22 = bxn.a(m1, "updatedAt");
            int a23 = bxn.a(m1, "deletedAt");
            int a24 = bxn.a(m1, "extraData");
            int a25 = bxn.a(m1, "syncStatus");
            int a26 = bxn.a(m1, "team");
            int a27 = bxn.a(m1, "ownCapabilities");
            int a28 = bxn.a(m1, "membership");
            int a29 = bxn.a(m1, "activeLiveLocations");
            int a30 = bxn.a(m1, "messageCount");
            int a31 = bxn.a(m1, "cid");
            zf3 zf3Var = null;
            Integer valueOf9 = null;
            if (m1.j1()) {
                String N010 = m1.N0(a);
                String N011 = m1.N0(a2);
                String N012 = m1.N0(a3);
                String N013 = m1.N0(a4);
                int i = (int) m1.getLong(a5);
                String N014 = m1.N0(a6);
                if (m1.isNull(a7)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a7);
                }
                List a32 = channelDao_Impl.__listConverter.a(N0);
                if (a32 != null) {
                    boolean z4 = false;
                    if (((int) m1.getLong(a8)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((int) m1.getLong(a9)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m1.isNull(a10)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) m1.getLong(a10));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool = Boolean.valueOf(z3);
                    } else {
                        bool = null;
                    }
                    if (m1.isNull(a11)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf((int) m1.getLong(a11));
                    }
                    if (valueOf2 != null) {
                        if (valueOf2.intValue() != 0) {
                            z4 = true;
                        }
                        bool2 = Boolean.valueOf(z4);
                    } else {
                        bool2 = null;
                    }
                    if (m1.isNull(a12)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m1.getLong(a12));
                    }
                    channelDao_Impl.__dateConverter.getClass();
                    Date b = ys5.b(valueOf3);
                    if (m1.isNull(a13)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m1.getLong(a13));
                    }
                    channelDao_Impl.__dateConverter.getClass();
                    Date b2 = ys5.b(valueOf4);
                    if (m1.isNull(a14)) {
                        N02 = null;
                    } else {
                        N02 = m1.N0(a14);
                    }
                    Map b3 = channelDao_Impl.__mapConverter.b(N02);
                    if (b3 != null) {
                        int i2 = (int) m1.getLong(a15);
                        if (m1.isNull(a16)) {
                            N03 = null;
                        } else {
                            N03 = m1.N0(a16);
                        }
                        List a33 = channelDao_Impl.__listConverter.a(N03);
                        if (a33 != null) {
                            int i3 = (int) m1.getLong(a17);
                            if (m1.isNull(a18)) {
                                N04 = null;
                            } else {
                                N04 = m1.N0(a18);
                            }
                            Map c = channelDao_Impl.__mapConverter.c(N04);
                            if (c != null) {
                                if (m1.isNull(a19)) {
                                    valueOf5 = null;
                                } else {
                                    valueOf5 = Long.valueOf(m1.getLong(a19));
                                }
                                channelDao_Impl.__dateConverter.getClass();
                                Date b4 = ys5.b(valueOf5);
                                if (m1.isNull(a20)) {
                                    N05 = null;
                                } else {
                                    N05 = m1.N0(a20);
                                }
                                if (m1.isNull(a21)) {
                                    valueOf6 = null;
                                } else {
                                    valueOf6 = Long.valueOf(m1.getLong(a21));
                                }
                                channelDao_Impl.__dateConverter.getClass();
                                Date b5 = ys5.b(valueOf6);
                                if (m1.isNull(a22)) {
                                    valueOf7 = null;
                                } else {
                                    valueOf7 = Long.valueOf(m1.getLong(a22));
                                }
                                channelDao_Impl.__dateConverter.getClass();
                                Date b6 = ys5.b(valueOf7);
                                if (m1.isNull(a23)) {
                                    valueOf8 = null;
                                } else {
                                    valueOf8 = Long.valueOf(m1.getLong(a23));
                                }
                                channelDao_Impl.__dateConverter.getClass();
                                Date b7 = ys5.b(valueOf8);
                                if (m1.isNull(a24)) {
                                    N06 = null;
                                } else {
                                    N06 = m1.N0(a24);
                                }
                                Map b8 = channelDao_Impl.__extraDataConverter.b(N06);
                                if (b8 != null) {
                                    int i4 = (int) m1.getLong(a25);
                                    channelDao_Impl.__syncStatusConverter.getClass();
                                    SyncStatus a34 = mhi.a(i4);
                                    String N015 = m1.N0(a26);
                                    if (m1.isNull(a27)) {
                                        N07 = null;
                                    } else {
                                        N07 = m1.N0(a27);
                                    }
                                    Set a35 = channelDao_Impl.__setConverter.a(N07);
                                    if (m1.isNull(a28)) {
                                        N08 = null;
                                    } else {
                                        N08 = m1.N0(a28);
                                    }
                                    MemberEntity a36 = channelDao_Impl.__memberConverter.a(N08);
                                    if (m1.isNull(a29)) {
                                        N09 = null;
                                    } else {
                                        N09 = m1.N0(a29);
                                    }
                                    List b9 = channelDao_Impl.__locationConverter.b(N09);
                                    if (b9 != null) {
                                        if (!m1.isNull(a30)) {
                                            valueOf9 = Integer.valueOf((int) m1.getLong(a30));
                                        }
                                        zf3 zf3Var2 = new zf3(N010, N011, N012, N013, i, N014, a32, z, z2, bool, bool2, b, b2, b3, i2, a33, i3, c, b4, N05, b5, b6, b7, b8, a34, N015, a35, a36, b9, valueOf9);
                                        String N016 = m1.N0(a31);
                                        N016.getClass();
                                        zf3Var2.E = N016;
                                        zf3Var = zf3Var2;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
            }
            m1.close();
            return zf3Var;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final List select$lambda$9(String str, List list, ChannelDao_Impl channelDao_Impl, fcg fcgVar) {
        String N0;
        boolean z;
        boolean z2;
        Integer valueOf;
        Boolean bool;
        int i;
        Boolean bool2;
        Integer valueOf2;
        Boolean bool3;
        Long valueOf3;
        Long valueOf4;
        String N02;
        int i2;
        String N03;
        String N04;
        Long valueOf5;
        String N05;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        String N06;
        String N07;
        String N08;
        String N09;
        boolean z3;
        boolean z4;
        ChannelDao_Impl channelDao_Impl2 = channelDao_Impl;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            Iterator it = list.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                m1.H(i3, (String) it.next());
                i3++;
            }
            int a = bxn.a(m1, "type");
            int a2 = bxn.a(m1, "channelId");
            int a3 = bxn.a(m1, Keys.KEY_NAME);
            int a4 = bxn.a(m1, "image");
            int a5 = bxn.a(m1, "cooldown");
            int a6 = bxn.a(m1, "createdByUserId");
            int a7 = bxn.a(m1, "filterTags");
            int a8 = bxn.a(m1, "frozen");
            int a9 = bxn.a(m1, "disabled");
            int a10 = bxn.a(m1, "blocked");
            int a11 = bxn.a(m1, "hidden");
            int a12 = bxn.a(m1, "hideMessagesBefore");
            int a13 = bxn.a(m1, "truncatedAt");
            int a14 = bxn.a(m1, "members");
            int a15 = bxn.a(m1, "memberCount");
            int a16 = bxn.a(m1, "watcherIds");
            int a17 = bxn.a(m1, "watcherCount");
            int a18 = bxn.a(m1, "reads");
            int a19 = bxn.a(m1, "lastMessageAt");
            int a20 = bxn.a(m1, "lastMessageId");
            int a21 = bxn.a(m1, "createdAt");
            int a22 = bxn.a(m1, "updatedAt");
            int a23 = bxn.a(m1, "deletedAt");
            int a24 = bxn.a(m1, "extraData");
            int a25 = bxn.a(m1, "syncStatus");
            int a26 = bxn.a(m1, "team");
            int a27 = bxn.a(m1, "ownCapabilities");
            int a28 = bxn.a(m1, "membership");
            int a29 = bxn.a(m1, "activeLiveLocations");
            int a30 = bxn.a(m1, "messageCount");
            int a31 = bxn.a(m1, "cid");
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                String N010 = m1.N0(a);
                String N011 = m1.N0(a2);
                String N012 = m1.N0(a3);
                String N013 = m1.N0(a4);
                int i4 = a2;
                int i5 = a3;
                int i6 = (int) m1.getLong(a5);
                String N014 = m1.N0(a6);
                Integer num = null;
                if (m1.isNull(a7)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a7);
                }
                int i7 = a;
                List a32 = channelDao_Impl2.__listConverter.a(N0);
                if (a32 != null) {
                    if (((int) m1.getLong(a8)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i8 = a4;
                    if (((int) m1.getLong(a9)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m1.isNull(a10)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) m1.getLong(a10));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bool = Boolean.valueOf(z4);
                    } else {
                        bool = null;
                    }
                    if (m1.isNull(a11)) {
                        i = i8;
                        bool2 = bool;
                        valueOf2 = null;
                    } else {
                        i = i8;
                        bool2 = bool;
                        valueOf2 = Integer.valueOf((int) m1.getLong(a11));
                    }
                    if (valueOf2 != null) {
                        if (valueOf2.intValue() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool3 = Boolean.valueOf(z3);
                    } else {
                        bool3 = null;
                    }
                    if (m1.isNull(a12)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m1.getLong(a12));
                    }
                    Boolean bool4 = bool3;
                    channelDao_Impl2.__dateConverter.getClass();
                    Date b = ys5.b(valueOf3);
                    if (m1.isNull(a13)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m1.getLong(a13));
                    }
                    channelDao_Impl2.__dateConverter.getClass();
                    Date b2 = ys5.b(valueOf4);
                    int i9 = a14;
                    if (m1.isNull(i9)) {
                        N02 = null;
                    } else {
                        N02 = m1.N0(i9);
                    }
                    a14 = i9;
                    Map b3 = channelDao_Impl2.__mapConverter.b(N02);
                    if (b3 != null) {
                        int i10 = a15;
                        int i11 = i;
                        int i12 = (int) m1.getLong(i10);
                        int i13 = a16;
                        if (m1.isNull(i13)) {
                            i2 = i10;
                            N03 = null;
                        } else {
                            i2 = i10;
                            N03 = m1.N0(i13);
                        }
                        List a33 = channelDao_Impl2.__listConverter.a(N03);
                        if (a33 != null) {
                            a16 = i13;
                            int i14 = a17;
                            int i15 = (int) m1.getLong(i14);
                            int i16 = a18;
                            if (m1.isNull(i16)) {
                                N04 = null;
                            } else {
                                N04 = m1.N0(i16);
                            }
                            Map c = channelDao_Impl2.__mapConverter.c(N04);
                            if (c != null) {
                                int i17 = a19;
                                if (m1.isNull(i17)) {
                                    valueOf5 = null;
                                } else {
                                    valueOf5 = Long.valueOf(m1.getLong(i17));
                                }
                                a19 = i17;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b4 = ys5.b(valueOf5);
                                int i18 = a20;
                                if (m1.isNull(i18)) {
                                    N05 = null;
                                } else {
                                    N05 = m1.N0(i18);
                                }
                                int i19 = a21;
                                if (m1.isNull(i19)) {
                                    valueOf6 = null;
                                } else {
                                    valueOf6 = Long.valueOf(m1.getLong(i19));
                                }
                                a20 = i18;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b5 = ys5.b(valueOf6);
                                int i20 = a22;
                                if (m1.isNull(i20)) {
                                    valueOf7 = null;
                                } else {
                                    valueOf7 = Long.valueOf(m1.getLong(i20));
                                }
                                a22 = i20;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b6 = ys5.b(valueOf7);
                                int i21 = a23;
                                if (m1.isNull(i21)) {
                                    valueOf8 = null;
                                } else {
                                    valueOf8 = Long.valueOf(m1.getLong(i21));
                                }
                                a23 = i21;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b7 = ys5.b(valueOf8);
                                int i22 = a24;
                                if (m1.isNull(i22)) {
                                    a24 = i22;
                                    N06 = null;
                                } else {
                                    a24 = i22;
                                    N06 = m1.N0(i22);
                                }
                                a17 = i14;
                                Map b8 = channelDao_Impl2.__extraDataConverter.b(N06);
                                if (b8 != null) {
                                    a18 = i16;
                                    int i23 = a25;
                                    int i24 = (int) m1.getLong(i23);
                                    channelDao_Impl2.__syncStatusConverter.getClass();
                                    SyncStatus a34 = mhi.a(i24);
                                    int i25 = a26;
                                    String N015 = m1.N0(i25);
                                    int i26 = a27;
                                    if (m1.isNull(i26)) {
                                        a25 = i23;
                                        N07 = null;
                                    } else {
                                        a25 = i23;
                                        N07 = m1.N0(i26);
                                    }
                                    a26 = i25;
                                    Set a35 = channelDao_Impl2.__setConverter.a(N07);
                                    int i27 = a28;
                                    if (m1.isNull(i27)) {
                                        N08 = null;
                                    } else {
                                        N08 = m1.N0(i27);
                                    }
                                    a28 = i27;
                                    MemberEntity a36 = channelDao_Impl2.__memberConverter.a(N08);
                                    int i28 = a29;
                                    if (m1.isNull(i28)) {
                                        N09 = null;
                                    } else {
                                        N09 = m1.N0(i28);
                                    }
                                    a29 = i28;
                                    List b9 = channelDao_Impl2.__locationConverter.b(N09);
                                    if (b9 != null) {
                                        int i29 = a30;
                                        if (m1.isNull(i29)) {
                                            a27 = i26;
                                        } else {
                                            a27 = i26;
                                            num = Integer.valueOf((int) m1.getLong(i29));
                                        }
                                        zf3 zf3Var = new zf3(N010, N011, N012, N013, i6, N014, a32, z, z2, bool2, bool4, b, b2, b3, i12, a33, i15, c, b4, N05, b5, b6, b7, b8, a34, N015, a35, a36, b9, num);
                                        int i30 = a31;
                                        String N016 = m1.N0(i30);
                                        N016.getClass();
                                        zf3Var.E = N016;
                                        arrayList.add(zf3Var);
                                        channelDao_Impl2 = channelDao_Impl;
                                        a30 = i29;
                                        a31 = i30;
                                        a21 = i19;
                                        a2 = i4;
                                        a3 = i5;
                                        a = i7;
                                        a4 = i11;
                                        a15 = i2;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
            }
            m1.close();
            return arrayList;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final List selectAllCids$lambda$2(String str, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                arrayList.add(m1.N0(0));
            }
            return arrayList;
        } finally {
            m1.close();
        }
    }

    private static final List selectCidsBySyncNeeded$lambda$3(String str, ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            channelDao_Impl.__syncStatusConverter.getClass();
            m1.l(1, mhi.b(syncStatus));
            m1.l(2, i);
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                arrayList.add(m1.N0(0));
            }
            return arrayList;
        } finally {
            m1.close();
        }
    }

    private static final List selectSyncNeeded$lambda$6(String str, ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i, fcg fcgVar) {
        String N0;
        boolean z;
        boolean z2;
        Integer valueOf;
        Boolean bool;
        Boolean bool2;
        Integer valueOf2;
        Boolean bool3;
        Long valueOf3;
        Long valueOf4;
        String N02;
        int i2;
        String N03;
        String N04;
        Long valueOf5;
        String N05;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        String N06;
        int i3;
        String N07;
        String N08;
        String N09;
        int i4;
        boolean z3;
        boolean z4;
        ChannelDao_Impl channelDao_Impl2 = channelDao_Impl;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            channelDao_Impl2.__syncStatusConverter.getClass();
            m1.l(1, mhi.b(syncStatus));
            m1.l(2, i);
            int a = bxn.a(m1, "type");
            int a2 = bxn.a(m1, "channelId");
            int a3 = bxn.a(m1, Keys.KEY_NAME);
            int a4 = bxn.a(m1, "image");
            int a5 = bxn.a(m1, "cooldown");
            int a6 = bxn.a(m1, "createdByUserId");
            int a7 = bxn.a(m1, "filterTags");
            int a8 = bxn.a(m1, "frozen");
            int a9 = bxn.a(m1, "disabled");
            int a10 = bxn.a(m1, "blocked");
            int a11 = bxn.a(m1, "hidden");
            int a12 = bxn.a(m1, "hideMessagesBefore");
            int a13 = bxn.a(m1, "truncatedAt");
            int a14 = bxn.a(m1, "members");
            int a15 = bxn.a(m1, "memberCount");
            int a16 = bxn.a(m1, "watcherIds");
            int a17 = bxn.a(m1, "watcherCount");
            int a18 = bxn.a(m1, "reads");
            int a19 = bxn.a(m1, "lastMessageAt");
            int a20 = bxn.a(m1, "lastMessageId");
            int a21 = bxn.a(m1, "createdAt");
            int a22 = bxn.a(m1, "updatedAt");
            int a23 = bxn.a(m1, "deletedAt");
            int a24 = bxn.a(m1, "extraData");
            int a25 = bxn.a(m1, "syncStatus");
            int a26 = bxn.a(m1, "team");
            int a27 = bxn.a(m1, "ownCapabilities");
            int a28 = bxn.a(m1, "membership");
            int a29 = bxn.a(m1, "activeLiveLocations");
            int a30 = bxn.a(m1, "messageCount");
            int a31 = bxn.a(m1, "cid");
            ArrayList arrayList = new ArrayList();
            while (m1.j1()) {
                String N010 = m1.N0(a);
                String N011 = m1.N0(a2);
                String N012 = m1.N0(a3);
                String N013 = m1.N0(a4);
                int i5 = a;
                int i6 = a2;
                int i7 = (int) m1.getLong(a5);
                String N014 = m1.N0(a6);
                Integer num = null;
                if (m1.isNull(a7)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(a7);
                }
                List a32 = channelDao_Impl2.__listConverter.a(N0);
                if (a32 != null) {
                    int i8 = a3;
                    int i9 = a4;
                    if (((int) m1.getLong(a8)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i10 = a5;
                    if (((int) m1.getLong(a9)) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m1.isNull(a10)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf((int) m1.getLong(a10));
                    }
                    if (valueOf != null) {
                        if (valueOf.intValue() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bool = Boolean.valueOf(z4);
                    } else {
                        bool = null;
                    }
                    if (m1.isNull(a11)) {
                        a5 = i10;
                        bool2 = bool;
                        valueOf2 = null;
                    } else {
                        a5 = i10;
                        bool2 = bool;
                        valueOf2 = Integer.valueOf((int) m1.getLong(a11));
                    }
                    if (valueOf2 != null) {
                        if (valueOf2.intValue() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool3 = Boolean.valueOf(z3);
                    } else {
                        bool3 = null;
                    }
                    if (m1.isNull(a12)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m1.getLong(a12));
                    }
                    channelDao_Impl2.__dateConverter.getClass();
                    Date b = ys5.b(valueOf3);
                    if (m1.isNull(a13)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m1.getLong(a13));
                    }
                    channelDao_Impl2.__dateConverter.getClass();
                    Date b2 = ys5.b(valueOf4);
                    int i11 = a14;
                    if (m1.isNull(i11)) {
                        N02 = null;
                    } else {
                        N02 = m1.N0(i11);
                    }
                    a14 = i11;
                    Map b3 = channelDao_Impl2.__mapConverter.b(N02);
                    if (b3 != null) {
                        int i12 = a15;
                        Boolean bool4 = bool3;
                        int i13 = (int) m1.getLong(i12);
                        int i14 = a16;
                        if (m1.isNull(i14)) {
                            i2 = i12;
                            N03 = null;
                        } else {
                            i2 = i12;
                            N03 = m1.N0(i14);
                        }
                        List a33 = channelDao_Impl2.__listConverter.a(N03);
                        if (a33 != null) {
                            int i15 = a17;
                            int i16 = (int) m1.getLong(i15);
                            int i17 = a18;
                            if (m1.isNull(i17)) {
                                N04 = null;
                            } else {
                                N04 = m1.N0(i17);
                            }
                            Map c = channelDao_Impl2.__mapConverter.c(N04);
                            if (c != null) {
                                int i18 = a19;
                                if (m1.isNull(i18)) {
                                    valueOf5 = null;
                                } else {
                                    valueOf5 = Long.valueOf(m1.getLong(i18));
                                }
                                a19 = i18;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b4 = ys5.b(valueOf5);
                                int i19 = a20;
                                if (m1.isNull(i19)) {
                                    N05 = null;
                                } else {
                                    N05 = m1.N0(i19);
                                }
                                int i20 = a21;
                                if (m1.isNull(i20)) {
                                    valueOf6 = null;
                                } else {
                                    valueOf6 = Long.valueOf(m1.getLong(i20));
                                }
                                a20 = i19;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b5 = ys5.b(valueOf6);
                                int i21 = a22;
                                if (m1.isNull(i21)) {
                                    valueOf7 = null;
                                } else {
                                    valueOf7 = Long.valueOf(m1.getLong(i21));
                                }
                                a22 = i21;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b6 = ys5.b(valueOf7);
                                int i22 = a23;
                                if (m1.isNull(i22)) {
                                    valueOf8 = null;
                                } else {
                                    valueOf8 = Long.valueOf(m1.getLong(i22));
                                }
                                a23 = i22;
                                channelDao_Impl2.__dateConverter.getClass();
                                Date b7 = ys5.b(valueOf8);
                                int i23 = a24;
                                if (m1.isNull(i23)) {
                                    a24 = i23;
                                    N06 = null;
                                } else {
                                    a24 = i23;
                                    N06 = m1.N0(i23);
                                }
                                Map b8 = channelDao_Impl2.__extraDataConverter.b(N06);
                                if (b8 != null) {
                                    a21 = i20;
                                    int i24 = a25;
                                    int i25 = (int) m1.getLong(i24);
                                    channelDao_Impl2.__syncStatusConverter.getClass();
                                    SyncStatus a34 = mhi.a(i25);
                                    int i26 = a26;
                                    String N015 = m1.N0(i26);
                                    int i27 = a27;
                                    if (m1.isNull(i27)) {
                                        i3 = i24;
                                        N07 = null;
                                    } else {
                                        i3 = i24;
                                        N07 = m1.N0(i27);
                                    }
                                    Set a35 = channelDao_Impl2.__setConverter.a(N07);
                                    int i28 = a28;
                                    if (m1.isNull(i28)) {
                                        N08 = null;
                                    } else {
                                        N08 = m1.N0(i28);
                                    }
                                    a28 = i28;
                                    MemberEntity a36 = channelDao_Impl2.__memberConverter.a(N08);
                                    int i29 = a29;
                                    if (m1.isNull(i29)) {
                                        N09 = null;
                                    } else {
                                        N09 = m1.N0(i29);
                                    }
                                    a29 = i29;
                                    List b9 = channelDao_Impl2.__locationConverter.b(N09);
                                    if (b9 != null) {
                                        int i30 = a30;
                                        if (m1.isNull(i30)) {
                                            i4 = i26;
                                            a27 = i27;
                                        } else {
                                            i4 = i26;
                                            a27 = i27;
                                            num = Integer.valueOf((int) m1.getLong(i30));
                                        }
                                        zf3 zf3Var = new zf3(N010, N011, N012, N013, i7, N014, a32, z, z2, bool2, bool4, b, b2, b3, i13, a33, i16, c, b4, N05, b5, b6, b7, b8, a34, N015, a35, a36, b9, num);
                                        int i31 = a31;
                                        String N016 = m1.N0(i31);
                                        N016.getClass();
                                        zf3Var.E = N016;
                                        arrayList.add(zf3Var);
                                        channelDao_Impl2 = channelDao_Impl;
                                        a15 = i2;
                                        a30 = i30;
                                        a31 = i31;
                                        a16 = i14;
                                        a17 = i15;
                                        a18 = i17;
                                        a25 = i3;
                                        a = i5;
                                        a4 = i9;
                                        a3 = i8;
                                        a26 = i4;
                                        a2 = i6;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.LocationEntity>', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.userread.`internal`.ChannelUserReadEntity>', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.channel.member.`internal`.MemberEntity>', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
            }
            m1.close();
            return arrayList;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final Unit setDeletedAt$lambda$14(String str, ChannelDao_Impl channelDao_Impl, Date date, String str2, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            channelDao_Impl.__dateConverter.getClass();
            Long a = ys5.a(date);
            if (a == null) {
                m1.m(1);
            } else {
                m1.l(1, a.longValue());
            }
            m1.H(2, str2);
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final Unit setHidden$lambda$15(String str, boolean z, ChannelDao_Impl channelDao_Impl, Date date, String str2, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.l(1, z ? 1L : 0L);
            channelDao_Impl.__dateConverter.getClass();
            Long a = ys5.a(date);
            if (a == null) {
                m1.m(2);
            } else {
                m1.l(2, a.longValue());
            }
            m1.H(3, str2);
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    private static final Unit setHidden$lambda$16(String str, boolean z, String str2, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.l(1, z ? 1L : 0L);
            m1.H(2, str2);
            m1.j1();
            m1.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            m1.close();
            throw th;
        }
    }

    @Override // defpackage.uf3
    public Object delete(String str, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new dd(str, 11), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.uf3
    public Object deleteAll(Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new x53(21), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.uf3
    public Object insert(zf3 zf3Var, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new l53(6, this, zf3Var), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.uf3
    public Object insertMany(List<zf3> list, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new l53(4, this, list), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.uf3
    public Object select(List<String> list, Continuation<? super List<zf3>> continuation) {
        StringBuilder s = sv6.s("SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN (");
        rql.b(list.size(), s);
        s.append(")");
        return vtn.f(this.__db, true, false, new h7(s.toString(), list, this, 12), continuation);
    }

    public Object selectAllCids(Continuation<? super List<String>> continuation) {
        return vtn.f(this.__db, true, true, new x53(20), continuation);
    }

    @Override // defpackage.uf3
    public Object selectCidsBySyncNeeded(SyncStatus syncStatus, int i, Continuation<? super List<String>> continuation) {
        return vtn.f(this.__db, true, false, new vf3(this, syncStatus, i, 1), continuation);
    }

    public Object selectSyncNeeded(SyncStatus syncStatus, int i, Continuation<? super List<zf3>> continuation) {
        return vtn.f(this.__db, true, false, new vf3(this, syncStatus, i, 0), continuation);
    }

    @Override // defpackage.uf3
    public Object setDeletedAt(String str, Date date, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new h7(this, date, str, 13), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    public Object setHidden(String str, boolean z, Date date, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new k50(z, this, date, str, 2), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    public Object setHidden(String str, boolean z, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new wf3(0, str, z), continuation);
        return f == u85.COROUTINE_SUSPENDED ? f : Unit.INSTANCE;
    }

    @Override // defpackage.uf3
    public Object select(String str, Continuation<? super zf3> continuation) {
        return vtn.f(this.__db, true, false, new l53(5, str, this), continuation);
    }
}
