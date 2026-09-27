package defpackage;

import com.polymarket.clients.ChatConnectionState;
import io.getstream.chat.android.models.ConnectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xv implements eb8 {
    public final /* synthetic */ fw a;

    public xv(fw fwVar) {
        this.a = fwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ConnectionState connectionState, Continuation continuation) {
        wv wvVar;
        u85 u85Var;
        int i;
        fw fwVar;
        ChatConnectionState chatConnectionState;
        ChatConnectionState chatConnectionState2;
        ChatConnectionState chatConnectionState3;
        ChatConnectionState chatConnectionState4;
        ChatConnectionState chatConnectionState5;
        if (continuation instanceof wv) {
            wvVar = (wv) continuation;
            int i2 = wvVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wvVar.o = i2 - Integer.MIN_VALUE;
                Object obj = wvVar.m;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = wvVar.o;
                fwVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            chatConnectionState5 = wvVar.k;
                            ResultKt.a(obj);
                            chatConnectionState2 = chatConnectionState5;
                            if (chatConnectionState2 == ChatConnectionState.connected) {
                                fwVar.p = true;
                            }
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chatConnectionState3 = wvVar.l;
                    chatConnectionState2 = wvVar.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    connectionState.getClass();
                    if (connectionState instanceof ConnectionState.Connected) {
                        chatConnectionState = ChatConnectionState.connected;
                    } else if (connectionState instanceof ConnectionState.Connecting) {
                        chatConnectionState = ChatConnectionState.connecting;
                    } else if (connectionState instanceof ConnectionState.Offline) {
                        chatConnectionState = ChatConnectionState.disconnected;
                    } else {
                        dmk.a();
                        return null;
                    }
                    ChatConnectionState chatConnectionState6 = fwVar.o;
                    fwVar.o = chatConnectionState;
                    oba obaVar = fwVar.f;
                    io3 io3Var = new io3(chatConnectionState);
                    wvVar.k = chatConnectionState;
                    wvVar.l = chatConnectionState6;
                    wvVar.o = 1;
                    if (obaVar.c(io3Var, wvVar) != u85Var) {
                        chatConnectionState2 = chatConnectionState;
                        chatConnectionState3 = chatConnectionState6;
                    }
                    return u85Var;
                }
                chatConnectionState4 = ChatConnectionState.connected;
                if (chatConnectionState2 == chatConnectionState4) {
                    fwVar.a();
                }
                if (chatConnectionState2 == chatConnectionState4 && fwVar.p && chatConnectionState3 != chatConnectionState4) {
                    wvVar.k = chatConnectionState2;
                    wvVar.l = null;
                    wvVar.o = 2;
                    if (fwVar.h(wvVar) != u85Var) {
                        chatConnectionState5 = chatConnectionState2;
                        chatConnectionState2 = chatConnectionState5;
                    }
                    return u85Var;
                }
                if (chatConnectionState2 == ChatConnectionState.connected) {
                }
                return Unit.INSTANCE;
            }
        }
        wvVar = new wv(this, continuation);
        Object obj2 = wvVar.m;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = wvVar.o;
        fwVar = this.a;
        if (i == 0) {
        }
        chatConnectionState4 = ChatConnectionState.connected;
        if (chatConnectionState2 == chatConnectionState4) {
        }
        if (chatConnectionState2 == chatConnectionState4) {
            wvVar.k = chatConnectionState2;
            wvVar.l = null;
            wvVar.o = 2;
            if (fwVar.h(wvVar) != u85Var) {
            }
            return u85Var;
        }
        if (chatConnectionState2 == ChatConnectionState.connected) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.eb8
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a((ConnectionState) obj, continuation);
    }
}
