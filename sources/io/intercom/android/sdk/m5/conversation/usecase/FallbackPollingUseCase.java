package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.dmk;
import defpackage.gz6;
import defpackage.sqc;
import defpackage.u85;
import defpackage.uwh;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase;", "", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "timeProvider", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshConversationUseCase", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/intercom/android/sdk/utilities/commons/TimeProvider;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;)V", "Lsqc;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "", "invoke", "(Lsqc;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function0;", "getAppConfig", "()Lkotlin/jvm/functions/Function0;", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "getTimeProvider", "()Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "getRefreshConversationUseCase", "()Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FallbackPollingUseCase {
    public static final int $stable = 8;
    private final Function0<AppConfig> appConfig;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final TimeProvider timeProvider;

    public /* synthetic */ FallbackPollingUseCase(Function0 function0, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new gz6(28) : function0, (i & 2) != 0 ? Injector.get().getTimeProvider() : timeProvider, refreshConversationUseCase);
    }

    private static final AppConfig _init_$lambda$0() {
        return (AppConfig) Injector.get().getDataLayer().getConfig().getValue();
    }

    public static /* synthetic */ AppConfig a() {
        return _init_$lambda$0();
    }

    public final Function0<AppConfig> getAppConfig() {
        return this.appConfig;
    }

    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        if (defpackage.lvn.b(r6, r0) != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ea -> B:11:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(sqc sqcVar, Continuation<? super Unit> continuation) {
        FallbackPollingUseCase$invoke$1 fallbackPollingUseCase$invoke$1;
        int i;
        FallbackPollingUseCase fallbackPollingUseCase;
        sqc sqcVar2;
        Part part;
        List<Part> parts;
        Part part2;
        if (continuation instanceof FallbackPollingUseCase$invoke$1) {
            fallbackPollingUseCase$invoke$1 = (FallbackPollingUseCase$invoke$1) continuation;
            int i2 = fallbackPollingUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackPollingUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackPollingUseCase$invoke$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = fallbackPollingUseCase$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            sqc sqcVar3 = (sqc) fallbackPollingUseCase$invoke$1.L$1;
                            FallbackPollingUseCase fallbackPollingUseCase2 = (FallbackPollingUseCase) fallbackPollingUseCase$invoke$1.L$0;
                            ResultKt.a(obj);
                            sqcVar = sqcVar3;
                            this = fallbackPollingUseCase2;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sqcVar2 = (sqc) fallbackPollingUseCase$invoke$1.L$1;
                        fallbackPollingUseCase = (FallbackPollingUseCase) fallbackPollingUseCase$invoke$1.L$0;
                        ResultKt.a(obj);
                        FallbackPollingUseCase fallbackPollingUseCase3 = fallbackPollingUseCase;
                        sqcVar = sqcVar2;
                        this = fallbackPollingUseCase3;
                        long syncInterval = this.appConfig.invoke().getConversationStateSyncSettings().getSyncInterval();
                        fallbackPollingUseCase$invoke$1.L$0 = this;
                        fallbackPollingUseCase$invoke$1.L$1 = sqcVar;
                        fallbackPollingUseCase$invoke$1.label = 2;
                    }
                } else {
                    ResultKt.a(obj);
                }
                if (!this.appConfig.invoke().getConversationStateSyncSettings().getEnabled()) {
                    sqcVar = (uwh) sqcVar;
                    Conversation conversation = ((ConversationClientState) sqcVar.getValue()).getConversation();
                    if (conversation != null && (parts = conversation.parts()) != null) {
                        ListIterator<Part> listIterator = parts.listIterator(parts.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                part2 = listIterator.previous();
                                if (part2.isAdmin()) {
                                    break;
                                }
                            } else {
                                part2 = null;
                                break;
                            }
                        }
                        part = part2;
                    } else {
                        part = null;
                    }
                    if (part != null) {
                        if (this.timeProvider.currentTimeMillis() - (part.getCreatedAt() * 1000) > this.appConfig.invoke().getConversationStateSyncSettings().getStartTimeout()) {
                            RefreshConversationUseCase refreshConversationUseCase = this.refreshConversationUseCase;
                            GetConversationReason getConversationReason = GetConversationReason.POLLING;
                            fallbackPollingUseCase$invoke$1.L$0 = this;
                            fallbackPollingUseCase$invoke$1.L$1 = sqcVar;
                            fallbackPollingUseCase$invoke$1.label = 1;
                            if (refreshConversationUseCase.invoke(sqcVar, getConversationReason, fallbackPollingUseCase$invoke$1) != u85Var) {
                                fallbackPollingUseCase = this;
                                sqcVar2 = sqcVar;
                                FallbackPollingUseCase fallbackPollingUseCase32 = fallbackPollingUseCase;
                                sqcVar = sqcVar2;
                                this = fallbackPollingUseCase32;
                            }
                            return u85Var;
                        }
                    }
                    long syncInterval2 = this.appConfig.invoke().getConversationStateSyncSettings().getSyncInterval();
                    fallbackPollingUseCase$invoke$1.L$0 = this;
                    fallbackPollingUseCase$invoke$1.L$1 = sqcVar;
                    fallbackPollingUseCase$invoke$1.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
        fallbackPollingUseCase$invoke$1 = new FallbackPollingUseCase$invoke$1(this, continuation);
        Object obj2 = fallbackPollingUseCase$invoke$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = fallbackPollingUseCase$invoke$1.label;
        if (i == 0) {
        }
        if (!this.appConfig.invoke().getConversationStateSyncSettings().getEnabled()) {
        }
    }

    public FallbackPollingUseCase(Function0<AppConfig> function0, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase) {
        function0.getClass();
        timeProvider.getClass();
        refreshConversationUseCase.getClass();
        this.appConfig = function0;
        this.timeProvider = timeProvider;
        this.refreshConversationUseCase = refreshConversationUseCase;
    }
}
