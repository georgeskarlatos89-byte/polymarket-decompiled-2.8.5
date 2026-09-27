package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.p;
import com.socure.idplus.device.error.SilentNetworkAuthError;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.CompleteSNARequestBody;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.SNAOutcome;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.SNARequestResult;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.SNAStatus;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.StartSNARequestBody;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.StartSNAResponse;
import java.net.SocketException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f {
    public final Context a;
    public final com.socure.idplus.device.internal.api.a b;
    public final ConnectivityManager c;
    public final com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.c d;
    public ExecutorService e;
    public final Object f;

    public f(Context context, com.socure.idplus.device.internal.api.a aVar) {
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.c cVar = new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.c();
        aVar.getClass();
        this.a = context;
        this.b = aVar;
        this.c = (ConnectivityManager) systemService;
        this.d = cVar;
        this.f = new Object();
    }

    public final void a(StartSNAResponse startSNAResponse, Network network, String str, Function1 function1, c cVar) {
        startSNAResponse.getClass();
        network.getClass();
        str.getClass();
        function1.getClass();
        cVar.getClass();
        try {
            try {
                try {
                    try {
                        SNARequestResult a = com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.d.a(startSNAResponse.getSnaUrl(), network);
                        if (a != null) {
                            a(a, str, startSNAResponse.getSnaRequestId(), function1);
                        } else {
                            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
                            a(SNAStatus.NETWORKING_ERROR, str, startSNAResponse.getSnaRequestId(), function1);
                        }
                        this.c.unregisterNetworkCallback(cVar);
                    } catch (SocketException e) {
                        e.getMessage();
                        com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
                        a(SNAStatus.NETWORKING_ERROR, str, startSNAResponse.getSnaRequestId(), function1);
                        this.c.unregisterNetworkCallback(cVar);
                    }
                } catch (IllegalArgumentException e2) {
                    e2.getMessage();
                    com.socure.idplus.device.internal.logger.a aVar3 = com.socure.idplus.device.internal.logger.a.D;
                    a(SNAStatus.NETWORKING_ERROR, str, startSNAResponse.getSnaRequestId(), function1);
                    this.c.unregisterNetworkCallback(cVar);
                }
            } catch (Exception e3) {
                e3.getMessage();
                com.socure.idplus.device.internal.logger.a aVar4 = com.socure.idplus.device.internal.logger.a.D;
                a(SNAStatus.NETWORKING_ERROR, str, startSNAResponse.getSnaRequestId(), function1);
                this.c.unregisterNetworkCallback(cVar);
            }
        } catch (Throwable th) {
            this.c.unregisterNetworkCallback(cVar);
            throw th;
        }
    }

    public final void a(String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        StartSNARequestBody startSNARequestBody = new StartSNARequestBody(str2);
        com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.c cVar = this.d;
        com.socure.idplus.device.internal.api.a aVar = this.b;
        d dVar = new d(this, str, function1);
        e eVar = new e(function1, this);
        cVar.getClass();
        aVar.getClass();
        str.getClass();
        com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.b(aVar, com.socure.idplus.device.internal.common.utils.a.a(str), startSNARequestBody), dVar, eVar);
    }

    public final void a(StartSNAResponse startSNAResponse, String str, Function1 function1) {
        Function1 function12;
        SecurityException securityException;
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).addCapability(13).build();
        if (build != null) {
            c cVar = new c(this, startSNAResponse, str, function1);
            try {
                try {
                } catch (SecurityException e) {
                    function12 = function1;
                    securityException = e;
                }
                try {
                    this.c.requestNetwork(build, cVar);
                } catch (SecurityException e2) {
                    securityException = e2;
                    function12 = function1;
                    securityException.getMessage();
                    com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
                    function12.invoke(new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.a(SilentNetworkAuthError.MissingPermissionsError, securityException.getMessage()));
                }
            } catch (Exception unused) {
                new Handler(Looper.getMainLooper()).postDelayed(new p(this, build, cVar, function1, 2), 500L);
            }
        }
    }

    public static final void a(f fVar, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Function1 function1) {
        try {
            fVar.c.requestNetwork(networkRequest, networkCallback);
        } catch (Exception e) {
            e.getMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            function1.invoke(new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.a(SilentNetworkAuthError.UnknownError, e.getMessage()));
        }
    }

    public static final SNAOutcome a(f fVar, com.socure.idplus.device.internal.network.a aVar) {
        Integer num = aVar.a;
        if (num != null && num.intValue() == 401) {
            return com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.b.a;
        }
        if (num != null && num.intValue() == 400) {
            return new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.a(SilentNetworkAuthError.InvalidMobileNumberError, aVar.c);
        }
        if (num != null && num.intValue() == 403) {
            return new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.a(SilentNetworkAuthError.UnAuthorizedError, aVar.c);
        }
        return (num != null && num.intValue() == 422) ? com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.c.a : new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.a(SilentNetworkAuthError.UnknownError, aVar.c);
    }

    public final void a(SNARequestResult sNARequestResult, String str, String str2, Function1 function1) {
        SNAStatus sNAStatus;
        String message = sNARequestResult.getMessage();
        if (message != null ? StringsKt.L(message, "ErrorCode=0&ErrorDescription=Success", false) : false) {
            sNAStatus = SNAStatus.SUCCESS;
        } else {
            String message2 = sNARequestResult.getMessage();
            if (message2 != null && message2.length() != 0) {
                sNAStatus = SNAStatus.NETWORKING_ERROR;
            } else {
                sNAStatus = SNAStatus.NO_RESULT_FROM_THE_URL;
            }
        }
        Objects.toString(sNAStatus);
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        a(sNAStatus, str, str2, function1);
    }

    public final void a(SNAStatus sNAStatus, String str, String str2, Function1 function1) {
        sNAStatus.getClass();
        str.getClass();
        str2.getClass();
        function1.getClass();
        CompleteSNARequestBody completeSNARequestBody = new CompleteSNARequestBody(sNAStatus.toString());
        com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.c cVar = this.d;
        com.socure.idplus.device.internal.api.a aVar = this.b;
        a aVar2 = new a(function1);
        b bVar = new b(function1, this);
        cVar.getClass();
        aVar.getClass();
        str.getClass();
        str2.getClass();
        com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.sigmaSilentNetworkAuth.dataHandler.a(aVar, str2, com.socure.idplus.device.internal.common.utils.a.a(str), completeSNARequestBody), aVar2, bVar);
        synchronized (this.f) {
            ExecutorService executorService = this.e;
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
