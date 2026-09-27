package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.af3;
import defpackage.b7h;
import defpackage.bf3;
import defpackage.bl0;
import defpackage.bxn;
import defpackage.cf3;
import defpackage.d1c;
import defpackage.dxn;
import defpackage.ef3;
import defpackage.fcg;
import defpackage.ff3;
import defpackage.fl0;
import defpackage.gf3;
import defpackage.gn2;
import defpackage.j9g;
import defpackage.kr;
import defpackage.l53;
import defpackage.lcg;
import defpackage.lh4;
import defpackage.mg7;
import defpackage.mt9;
import defpackage.rql;
import defpackage.sv6;
import defpackage.u85;
import defpackage.vtn;
import defpackage.x53;
import defpackage.ys5;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rH\u0096@¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\rH\u0096@¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006,"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;", "Laf3;", "Lj9g;", "__db", "<init>", "(Lj9g;)V", "Lfcg;", "_connection", "Lfl0;", "", "", "Llh4;", "_map", "", "__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity", "(Lfcg;Lfl0;)V", "Lgf3;", "channelConfigInnerEntity", "insertConfig", "(Lgf3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "channelConfigInnerEntities", "insertConfigs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commands", "insertCommands", "Lff3;", "channelConfigEntity", "insert", "(Lff3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCommands", "deleteConfigs", "Lj9g;", "Lmg7;", "__insertAdapterOfChannelConfigInnerEntity", "Lmg7;", "Lys5;", "__dateConverter", "Lys5;", "__insertAdapterOfCommandInnerEntity", "Companion", "ef3", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChannelConfigDao_Impl implements af3 {
    public static final ef3 Companion = new Object();
    private final ys5 __dateConverter;
    private final j9g __db;
    private final mg7 __insertAdapterOfChannelConfigInnerEntity;
    private final mg7 __insertAdapterOfCommandInnerEntity;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ys5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mg7] */
    public ChannelConfigDao_Impl(j9g j9gVar) {
        j9gVar.getClass();
        this.__dateConverter = new Object();
        this.__db = j9gVar;
        this.__insertAdapterOfChannelConfigInnerEntity = new cf3(this, 0);
        this.__insertAdapterOfCommandInnerEntity = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b7h, fl0] */
    private final void __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(fcg _connection, fl0 _map) {
        bl0 bl0Var = (bl0) _map.keySet();
        fl0 fl0Var = bl0Var.a;
        if (fl0Var.isEmpty()) {
            return;
        }
        if (_map.c > 999) {
            ?? b7hVar = new b7h(j9g.MAX_BIND_PARAMETER_CNT);
            int i = _map.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                b7hVar.put(_map.f(i2), _map.j(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    j(this, _connection, b7hVar);
                    b7hVar.clear();
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                j(this, _connection, b7hVar);
                return;
            }
            return;
        }
        StringBuilder s = sv6.s("SELECT `name`,`description`,`args`,`set`,`channelType`,`id` FROM `command_inner_entity` WHERE `channelType` IN (");
        rql.b(fl0Var.c, s);
        s.append(")");
        lcg m1 = _connection.m1(s.toString());
        Iterator it = bl0Var.iterator();
        int i4 = 1;
        while (true) {
            mt9 mt9Var = (mt9) it;
            if (mt9Var.hasNext()) {
                m1.H(i4, (String) mt9Var.next());
                i4++;
            } else {
                try {
                    break;
                } finally {
                    m1.close();
                }
            }
        }
        m1.getClass();
        int a = dxn.a(m1, "channelType");
        if (a == -1) {
            m1.close();
            return;
        }
        while (m1.j1()) {
            List list = (List) _map.get(m1.N0(a));
            if (list != null) {
                lh4 lh4Var = new lh4(m1.N0(0), m1.N0(1), m1.N0(2), m1.N0(3), m1.N0(4));
                lh4Var.f = (int) m1.getLong(5);
                list.add(lh4Var);
            }
        }
    }

    private static final Unit __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity$lambda$6(ChannelConfigDao_Impl channelConfigDao_Impl, fcg fcgVar, fl0 fl0Var) {
        fl0Var.getClass();
        channelConfigDao_Impl.__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(fcgVar, fl0Var);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ ys5 access$get__dateConverter$p(ChannelConfigDao_Impl channelConfigDao_Impl) {
        return channelConfigDao_Impl.__dateConverter;
    }

    /* renamed from: access$insert$s-21986483, reason: not valid java name */
    public static final Object m47access$insert$s21986483(ChannelConfigDao_Impl channelConfigDao_Impl, ff3 ff3Var, Continuation continuation) {
        channelConfigDao_Impl.getClass();
        return af3.b(channelConfigDao_Impl, ff3Var, continuation);
    }

    public static /* synthetic */ Unit d(ChannelConfigDao_Impl channelConfigDao_Impl, gf3 gf3Var, fcg fcgVar) {
        return insertConfig$lambda$0(channelConfigDao_Impl, gf3Var, fcgVar);
    }

    private static final Unit deleteCommands$lambda$4(String str, fcg fcgVar) {
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

    private static final Unit deleteConfigs$lambda$5(String str, fcg fcgVar) {
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

    public static /* synthetic */ List e(ChannelConfigDao_Impl channelConfigDao_Impl, fcg fcgVar) {
        return selectAll$lambda$3("SELECT * FROM stream_chat_channel_config LIMIT 100", channelConfigDao_Impl, fcgVar);
    }

    public static /* synthetic */ Unit f(fcg fcgVar) {
        return deleteCommands$lambda$4("DELETE FROM command_inner_entity", fcgVar);
    }

    public static /* synthetic */ Unit g(ChannelConfigDao_Impl channelConfigDao_Impl, List list, fcg fcgVar) {
        return insertConfigs$lambda$1(channelConfigDao_Impl, list, fcgVar);
    }

    public static /* synthetic */ Unit h(ChannelConfigDao_Impl channelConfigDao_Impl, List list, fcg fcgVar) {
        return insertCommands$lambda$2(channelConfigDao_Impl, list, fcgVar);
    }

    public static /* synthetic */ Unit i(fcg fcgVar) {
        return deleteConfigs$lambda$5("DELETE FROM stream_chat_channel_config", fcgVar);
    }

    private static final Unit insertCommands$lambda$2(ChannelConfigDao_Impl channelConfigDao_Impl, List list, fcg fcgVar) {
        fcgVar.getClass();
        channelConfigDao_Impl.__insertAdapterOfCommandInnerEntity.c(fcgVar, list);
        return Unit.INSTANCE;
    }

    private static final Unit insertConfig$lambda$0(ChannelConfigDao_Impl channelConfigDao_Impl, gf3 gf3Var, fcg fcgVar) {
        fcgVar.getClass();
        channelConfigDao_Impl.__insertAdapterOfChannelConfigInnerEntity.d(fcgVar, gf3Var);
        return Unit.INSTANCE;
    }

    private static final Unit insertConfigs$lambda$1(ChannelConfigDao_Impl channelConfigDao_Impl, List list, fcg fcgVar) {
        fcgVar.getClass();
        channelConfigDao_Impl.__insertAdapterOfChannelConfigInnerEntity.c(fcgVar, list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit j(ChannelConfigDao_Impl channelConfigDao_Impl, fcg fcgVar, fl0 fl0Var) {
        return __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity$lambda$6(channelConfigDao_Impl, fcgVar, fl0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v24, types: [b7h, fl0] */
    private static final List selectAll$lambda$3(String str, ChannelConfigDao_Impl channelConfigDao_Impl, fcg fcgVar) {
        lcg lcgVar;
        Long valueOf;
        Long valueOf2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String N0;
        ChannelConfigDao_Impl channelConfigDao_Impl2 = channelConfigDao_Impl;
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            int a = bxn.a(m1, "channelType");
            int a2 = bxn.a(m1, "createdAt");
            int a3 = bxn.a(m1, "updatedAt");
            int a4 = bxn.a(m1, Keys.KEY_NAME);
            int a5 = bxn.a(m1, "isTypingEvents");
            int a6 = bxn.a(m1, "isReadEvents");
            int a7 = bxn.a(m1, "deliveryEventsEnabled");
            int a8 = bxn.a(m1, "isConnectEvents");
            int a9 = bxn.a(m1, "isSearch");
            int a10 = bxn.a(m1, "isReactionsEnabled");
            int a11 = bxn.a(m1, "isThreadEnabled");
            int a12 = bxn.a(m1, "isMutes");
            int a13 = bxn.a(m1, "uploadsEnabled");
            int a14 = bxn.a(m1, "urlEnrichmentEnabled");
            int a15 = bxn.a(m1, "customEventsEnabled");
            int a16 = bxn.a(m1, "pushNotificationsEnabled");
            int a17 = bxn.a(m1, "messageRetention");
            int a18 = bxn.a(m1, "maxMessageLength");
            int a19 = bxn.a(m1, "automod");
            int a20 = bxn.a(m1, "automodBehavior");
            int a21 = bxn.a(m1, "blocklistBehavior");
            int a22 = bxn.a(m1, "messageRemindersEnabled");
            int a23 = bxn.a(m1, "markMessagesPending");
            int a24 = bxn.a(m1, "pushLevel");
            ?? b7hVar = new b7h();
            while (m1.j1()) {
                int i = a12;
                String N02 = m1.N0(a);
                if (!b7hVar.containsKey(N02)) {
                    b7hVar.put(N02, new ArrayList());
                    a12 = i;
                    a11 = a11;
                } else {
                    a12 = i;
                }
            }
            int i2 = a11;
            int i3 = a12;
            m1.reset();
            channelConfigDao_Impl2.__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity(fcgVar, b7hVar);
            ArrayList arrayList = new ArrayList();
            ChannelConfigDao_Impl channelConfigDao_Impl3 = channelConfigDao_Impl2;
            Map map = b7hVar;
            while (m1.j1()) {
                String N03 = m1.N0(a);
                if (m1.isNull(a2)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(m1.getLong(a2));
                }
                channelConfigDao_Impl3.__dateConverter.getClass();
                Date b = ys5.b(valueOf);
                if (m1.isNull(a3)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(m1.getLong(a3));
                }
                channelConfigDao_Impl3.__dateConverter.getClass();
                Date b2 = ys5.b(valueOf2);
                String N04 = m1.N0(a4);
                if (((int) m1.getLong(a5)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Map map2 = map;
                if (((int) m1.getLong(a6)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((int) m1.getLong(a7)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((int) m1.getLong(a8)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (((int) m1.getLong(a9)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (((int) m1.getLong(a10)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i4 = a3;
                int i5 = i2;
                int i6 = a2;
                if (((int) m1.getLong(i5)) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i7 = i3;
                int i8 = a4;
                if (((int) m1.getLong(i7)) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i9 = a13;
                int i10 = a5;
                if (((int) m1.getLong(i9)) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i11 = a14;
                if (((int) m1.getLong(i11)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = a15;
                if (((int) m1.getLong(i12)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = a16;
                if (((int) m1.getLong(i13)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i14 = a17;
                String N05 = m1.N0(i14);
                int i15 = a18;
                int i16 = (int) m1.getLong(i15);
                int i17 = a19;
                String N06 = m1.N0(i17);
                int i18 = a20;
                String N07 = m1.N0(i18);
                int i19 = a21;
                String N08 = m1.N0(i19);
                a21 = i19;
                int i20 = a22;
                if (((int) m1.getLong(i20)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i21 = a23;
                if (((int) m1.getLong(i21)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i22 = a24;
                if (m1.isNull(i22)) {
                    N0 = null;
                } else {
                    N0 = m1.N0(i22);
                }
                gf3 gf3Var = new gf3(N03, b, b2, N04, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, N05, i16, N06, N07, N08, z13, z14, N0);
                Object c = d1c.c(map2, m1.N0(a));
                c.getClass();
                lcgVar = m1;
                try {
                    arrayList.add(new ff3(gf3Var, (List) c));
                    channelConfigDao_Impl3 = channelConfigDao_Impl;
                    a24 = i22;
                    m1 = lcgVar;
                    a4 = i8;
                    a3 = i4;
                    a23 = i21;
                    i3 = i7;
                    a16 = i13;
                    a2 = i6;
                    a18 = i15;
                    i2 = i5;
                    a5 = i10;
                    a13 = i9;
                    a14 = i11;
                    a15 = i12;
                    a17 = i14;
                    a22 = i20;
                    a19 = i17;
                    a20 = i18;
                    map = map2;
                } catch (Throwable th) {
                    th = th;
                    lcgVar.close();
                    throw th;
                }
            }
            m1.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            lcgVar = m1;
        }
    }

    @Override // defpackage.af3
    public Object deleteAll(Continuation continuation) {
        return af3.c(this, continuation);
    }

    @Override // defpackage.af3
    public Object deleteCommands(Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new x53(19), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object deleteConfigs(Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new x53(18), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object insert(ff3 ff3Var, Continuation<? super Unit> continuation) {
        Object e = vtn.e(this.__db, new kr(this, ff3Var, null, 13), continuation);
        if (e == u85.COROUTINE_SUSPENDED) {
            return e;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object insertCommands(List<lh4> list, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new bf3(this, list, 1), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object insertConfig(gf3 gf3Var, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new l53(3, this, gf3Var), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object insertConfigs(List<gf3> list, Continuation<? super Unit> continuation) {
        Object f = vtn.f(this.__db, false, true, new bf3(this, list, 0), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.af3
    public Object selectAll(Continuation<? super List<ff3>> continuation) {
        return vtn.f(this.__db, true, true, new gn2(this, 9), continuation);
    }

    @Override // defpackage.af3
    public Object insert(List list, Continuation continuation) {
        return af3.a(this, list, continuation);
    }
}
