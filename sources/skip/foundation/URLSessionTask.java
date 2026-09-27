package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.elj;
import defpackage.flj;
import defpackage.fm1;
import defpackage.glj;
import defpackage.hm6;
import defpackage.ivi;
import defpackage.lrh;
import defpackage.pkj;
import defpackage.ug7;
import defpackage.wnh;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import okhttp3.Request;
import skip.foundation.URLError;
import skip.lib.Dictionary;
import skip.lib.DictionaryKt;
import skip.lib.Error;
import skip.lib.ErrorKt;
import skip.lib.NumbersKt;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.Tuple2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 y2\u00020\u0001:\u0003xyzBa\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012(\b\u0002\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010d\u001a\u00020\u000bH\u0016J\b\u0010e\u001a\u00020\u000bH\u0016J\b\u0010g\u001a\u00020\u000bH\u0016J\u001d\u0010h\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010i\u001a\u00020jH\u0010¢\u0006\u0002\bkJ\r\u0010l\u001a\u00020\u000bH\u0010¢\u0006\u0002\bmJ+\u0010n\u001a\u00020\u000b2\b\u0010o\u001a\u0004\u0018\u00010\u000e2\b\u0010p\u001a\u0004\u0018\u00010\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u0010H\u0010¢\u0006\u0002\bqJ=\u0010r\u001a\u00020\u000b\"\u0004\b\u0000\u0010s2\b\u0010t\u001a\u0004\u0018\u0001Hs2\b\u0010\u0002\u001a\u0004\u0018\u0001Hs2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u0002Hs\u0012\u0004\u0012\u00020\u000b0\tH\u0010¢\u0006\u0004\bv\u0010wR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR4\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001e\u00105\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b8\u00109R0\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\"\u001a\u0004\u0018\u00010:8V@VX\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b<\u00107\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010F\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR*\u0010I\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010H\"\u0004\bK\u0010LR\u0016\u0010M\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010!R\u0014\u0010O\u001a\u00020-X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0014\u0010Q\u001a\u00020-X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bR\u0010/R\u0014\u0010S\u001a\u00020-X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bT\u0010/R\u0014\u0010U\u001a\u00020-X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bV\u0010/R$\u0010X\u001a\u00020W2\u0006\u0010\"\u001a\u00020W8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020WX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010^\u001a\u0004\u0018\u00010_X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u000e\u0010f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lskip/foundation/URLSessionTask;", "", "session", "Lskip/foundation/URLSession;", "request", "Lskip/foundation/URLRequest;", "taskIdentifier", "", "build", "Lkotlin/Function1;", "Lokhttp3/Request$Builder;", "", "completionHandler", "Lkotlin/Function3;", "Lskip/foundation/Data;", "Lskip/foundation/URLResponse;", "Lskip/lib/Error;", "<init>", "(Lskip/foundation/URLSession;Lskip/foundation/URLRequest;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getSession$SkipFoundation", "()Lskip/foundation/URLSession;", "getBuild$SkipFoundation", "()Lkotlin/jvm/functions/Function1;", "lock", "Lskip/foundation/NSRecursiveLock;", "getLock$SkipFoundation", "()Lskip/foundation/NSRecursiveLock;", "getCompletionHandler$SkipFoundation", "()Lkotlin/jvm/functions/Function3;", "getTaskIdentifier", "()I", "originalRequest", "getOriginalRequest", "()Lskip/foundation/URLRequest;", "newValue", "Lskip/foundation/URLSessionTaskDelegate;", "delegate", "getDelegate", "()Lskip/foundation/URLSessionTaskDelegate;", "setDelegate", "(Lskip/foundation/URLSessionTaskDelegate;)V", "_delegate", "get_delegate", "set_delegate", "countOfBytesClientExpectsToReceive", "", "getCountOfBytesClientExpectsToReceive", "()J", "setCountOfBytesClientExpectsToReceive", "(J)V", "countOfBytesClientExpectsToSend", "getCountOfBytesClientExpectsToSend", "setCountOfBytesClientExpectsToSend", "progress", "getProgress$annotations", "()V", "getProgress", "()Ljava/lang/Object;", "Lskip/foundation/Date;", "earliestBeginDate", "getEarliestBeginDate$annotations", "getEarliestBeginDate", "()Lskip/foundation/Date;", "setEarliestBeginDate", "(Lskip/foundation/Date;)V", "state", "Lskip/foundation/URLSessionTask$State;", "getState", "()Lskip/foundation/URLSessionTask$State;", "_state", "error", "getError", "()Lskip/lib/Error;", "_error", "get_error", "set_error", "(Lskip/lib/Error;)V", "currentRequest", "getCurrentRequest", "countOfBytesReceived", "getCountOfBytesReceived", "countOfBytesSent", "getCountOfBytesSent", "countOfBytesExpectedToSend", "getCountOfBytesExpectedToSend", "countOfBytesExpectedToReceive", "getCountOfBytesExpectedToReceive", "", "priority", "getPriority", "()F", "setPriority", "(F)V", "_priority", "taskDescription", "", "getTaskDescription", "()Ljava/lang/String;", "setTaskDescription", "(Ljava/lang/String;)V", "cancel", "suspend", "_suspendCount", "resume", "open", "with", "Lskip/foundation/URL;", "open$SkipFoundation", "close", "close$SkipFoundation", "completion", ApiConstant.KEY_DATA, "response", "completion$SkipFoundation", "withDelegates", "D", "task", "operation", "withDelegates$SkipFoundation", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "State", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class URLSessionTask {
    private URLSessionTaskDelegate _delegate;
    private Error _error;
    private float _priority;
    private State _state;
    private int _suspendCount;
    private final Function1<Request.Builder, Unit> build;
    private final Function3<Data, URLResponse, Error, Unit> completionHandler;
    private long countOfBytesClientExpectsToReceive;
    private long countOfBytesClientExpectsToSend;
    private final long countOfBytesExpectedToReceive;
    private final long countOfBytesExpectedToSend;
    private final long countOfBytesReceived;
    private final long countOfBytesSent;
    private Date earliestBeginDate;
    private final NSRecursiveLock lock;
    private final URLRequest originalRequest;
    private final Object progress;
    private final URLSession session;
    private String taskDescription;
    private final int taskIdentifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float defaultPriority = 0.5f;
    private static final float lowPriority = 0.25f;
    private static final float highPriority = 0.75f;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lskip/foundation/URLSessionTask$CompanionClass;", "", "<init>", "()V", "defaultPriority", "", "getDefaultPriority", "()F", "lowPriority", "getLowPriority", "highPriority", "getHighPriority", "State", "Lskip/foundation/URLSessionTask$State;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass {
        public State State(int rawValue) {
            return URLSessionTask.INSTANCE.State(rawValue);
        }

        public float getDefaultPriority() {
            return URLSessionTask.INSTANCE.getDefaultPriority();
        }

        public float getHighPriority() {
            return URLSessionTask.INSTANCE.getHighPriority();
        }

        public float getLowPriority() {
            return URLSessionTask.INSTANCE.getLowPriority();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public URLSessionTask(URLSession uRLSession, URLRequest uRLRequest, int i, Function1<? super Request.Builder, Unit> function1, Function3<? super Data, ? super URLResponse, ? super Error, Unit> function3) {
        uRLSession.getClass();
        uRLRequest.getClass();
        function1.getClass();
        this.lock = new NSRecursiveLock();
        this.countOfBytesClientExpectsToReceive = NumbersKt.Long((Number) (-1));
        this.countOfBytesClientExpectsToSend = NumbersKt.Long((Number) (-1));
        this._state = State.suspended;
        this._priority = defaultPriority;
        this.session = uRLSession;
        this.originalRequest = (URLRequest) StructKt.sref$default(uRLRequest, null, 1, null);
        this.taskIdentifier = i;
        this.build = function1;
        this.completionHandler = function3;
    }

    private static final Unit _get__delegate_$lambda$4(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        uRLSessionTask.set_delegate(uRLSessionTaskDelegate);
        return Unit.INSTANCE;
    }

    private static final Unit _get__error_$lambda$7(URLSessionTask uRLSessionTask, Error error) {
        uRLSessionTask.set_error(error);
        return Unit.INSTANCE;
    }

    private static final URLSessionTaskDelegate _get_delegate_$lambda$1(URLSessionTask uRLSessionTask) {
        return uRLSessionTask.get_delegate();
    }

    private static final Unit _get_delegate_$lambda$2(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        uRLSessionTask.setDelegate(uRLSessionTaskDelegate);
        return Unit.INSTANCE;
    }

    private static final Error _get_error_$lambda$6(URLSessionTask uRLSessionTask) {
        return uRLSessionTask.get_error();
    }

    private static final float _get_priority_$lambda$8(URLSessionTask uRLSessionTask) {
        return uRLSessionTask._priority;
    }

    private static final State _get_state_$lambda$5(URLSessionTask uRLSessionTask) {
        return uRLSessionTask._state;
    }

    private static final Unit _init_$lambda$0(Request.Builder builder) {
        builder.getClass();
        return Unit.INSTANCE;
    }

    private static final Unit _set_delegate_$lambda$3(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        uRLSessionTask.set_delegate(uRLSessionTaskDelegate);
        return Unit.INSTANCE;
    }

    private static final Unit _set_priority_$lambda$9(URLSessionTask uRLSessionTask, float f) {
        uRLSessionTask._priority = f;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(URLSessionTask uRLSessionTask) {
        return suspend$lambda$12(uRLSessionTask);
    }

    public static final /* synthetic */ float access$getDefaultPriority$cp() {
        return defaultPriority;
    }

    public static final /* synthetic */ float access$getHighPriority$cp() {
        return highPriority;
    }

    public static final /* synthetic */ float access$getLowPriority$cp() {
        return lowPriority;
    }

    public static /* synthetic */ Unit b(Request.Builder builder) {
        return _init_$lambda$0(builder);
    }

    public static /* synthetic */ Unit c(URLSessionTask uRLSessionTask, Error error, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        return completion$lambda$16(uRLSessionTask, error, uRLSessionTaskDelegate);
    }

    private static final Unit cancel$lambda$11(URLSessionTask uRLSessionTask, Ref.ObjectRef objectRef) {
        URL url;
        State state = uRLSessionTask._state;
        if (state != State.running && state != State.suspended) {
            return Unit.INSTANCE;
        }
        uRLSessionTask._state = State.canceling;
        Dictionary dictionaryOf = DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSLocalizedDescriptionKey(), String.valueOf(URLError.Code.cancelled)));
        URLRequest uRLRequest = uRLSessionTask.originalRequest;
        if (uRLRequest != null) {
            url = uRLRequest.getUrl();
        } else {
            url = null;
        }
        URL url2 = (URL) StructKt.sref$default(url, null, 1, null);
        if (url2 != null) {
            dictionaryOf.set(NSErrorKt.getNSURLErrorFailingURLErrorKey(), StructKt.sref$default(url2, null, 1, null));
            dictionaryOf.set(NSErrorKt.getNSURLErrorFailingURLStringErrorKey(), url2.getAbsoluteString());
        }
        try {
            uRLSessionTask.close$SkipFoundation();
        } catch (Throwable th) {
            ErrorKt.aserror(th);
        }
        objectRef.a = new URLError(URLError.Code.cancelled, dictionaryOf);
        return Unit.INSTANCE;
    }

    private static final Unit completion$lambda$14(URLSessionTask uRLSessionTask, Error error) {
        State state;
        uRLSessionTask.set_error(error);
        State state2 = uRLSessionTask._state;
        State state3 = State.completed;
        if (state2 != state3 && state2 != (state = State.canceling)) {
            if (error != null) {
                state3 = state;
            }
            uRLSessionTask._state = state3;
        }
        return Unit.INSTANCE;
    }

    private static final Unit completion$lambda$16(URLSessionTask uRLSessionTask, Error error, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        uRLSessionTaskDelegate.getClass();
        uRLSessionTaskDelegate.urlSession(uRLSessionTask.session, uRLSessionTask, error);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(URLSessionTask uRLSessionTask, Error error) {
        return _get__error_$lambda$7(uRLSessionTask, error);
    }

    public static /* synthetic */ float e(URLSessionTask uRLSessionTask) {
        return _get_priority_$lambda$8(uRLSessionTask);
    }

    public static /* synthetic */ Error f(URLSessionTask uRLSessionTask) {
        return _get_error_$lambda$6(uRLSessionTask);
    }

    public static /* synthetic */ State g(URLSessionTask uRLSessionTask) {
        return _get_state_$lambda$5(uRLSessionTask);
    }

    private final URLSessionTaskDelegate get_delegate() {
        return (URLSessionTaskDelegate) StructKt.sref(this._delegate, new elj(this, 0));
    }

    private final Error get_error() {
        return (Error) StructKt.sref(this._error, new elj(this, 2));
    }

    public static /* synthetic */ Unit h(URLSessionTask uRLSessionTask, float f) {
        return _set_priority_$lambda$9(uRLSessionTask, f);
    }

    public static /* synthetic */ Unit i(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        return _get__delegate_$lambda$4(uRLSessionTask, uRLSessionTaskDelegate);
    }

    public static /* synthetic */ Unit j(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        return _set_delegate_$lambda$3(uRLSessionTask, uRLSessionTaskDelegate);
    }

    public static /* synthetic */ Unit k(URLSessionTask uRLSessionTask, URLSessionTaskDelegate uRLSessionTaskDelegate) {
        return _get_delegate_$lambda$2(uRLSessionTask, uRLSessionTaskDelegate);
    }

    public static /* synthetic */ URLSessionTaskDelegate l(URLSessionTask uRLSessionTask) {
        return _get_delegate_$lambda$1(uRLSessionTask);
    }

    public static /* synthetic */ Unit m(URLSessionTask uRLSessionTask, Error error) {
        return completion$lambda$14(uRLSessionTask, error);
    }

    public static /* synthetic */ Unit n(URLSessionTask uRLSessionTask, Ref.ObjectRef objectRef) {
        return resume$lambda$13(uRLSessionTask, objectRef);
    }

    public static /* synthetic */ Unit o(URLSessionTask uRLSessionTask, Ref.ObjectRef objectRef) {
        return cancel$lambda$11(uRLSessionTask, objectRef);
    }

    public static /* synthetic */ Unit p(Object obj, Function1 function1, Object obj2) {
        return withDelegates$lambda$17(obj, function1, obj2);
    }

    private static final Unit resume$lambda$13(URLSessionTask uRLSessionTask, Ref.ObjectRef objectRef) {
        State state = uRLSessionTask._state;
        if (state != State.canceling && state != State.completed) {
            int i = uRLSessionTask._suspendCount;
            if (i > 0) {
                i--;
                uRLSessionTask._suspendCount = i;
            }
            if (i != 0) {
                return Unit.INSTANCE;
            }
            uRLSessionTask._state = State.running;
            URLRequest uRLRequest = (URLRequest) StructKt.sref$default(uRLSessionTask.originalRequest, null, 1, null);
            if (uRLRequest == null) {
                objectRef.a = new URLError(URLError.Code.badURL, null, 2, null);
                return Unit.INSTANCE;
            }
            URL url = (URL) StructKt.sref$default(uRLRequest.getUrl(), null, 1, null);
            if (url == null) {
                objectRef.a = new URLError(URLError.Code.badURL, null, 2, null);
                return Unit.INSTANCE;
            }
            try {
                uRLSessionTask.open$SkipFoundation(uRLRequest, url);
            } catch (Throwable th) {
                objectRef.a = StructKt.sref$default(ErrorKt.aserror(th), null, 1, null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final void set_delegate(URLSessionTaskDelegate uRLSessionTaskDelegate) {
        this._delegate = (URLSessionTaskDelegate) StructKt.sref$default(uRLSessionTaskDelegate, null, 1, null);
    }

    private final void set_error(Error error) {
        this._error = (Error) StructKt.sref$default(error, null, 1, null);
    }

    private static final Unit suspend$lambda$12(URLSessionTask uRLSessionTask) {
        State state = uRLSessionTask._state;
        if (state != State.canceling && state != State.completed) {
            int i = uRLSessionTask._suspendCount + 1;
            uRLSessionTask._suspendCount = i;
            uRLSessionTask._state = State.suspended;
            if (i != 1) {
                return Unit.INSTANCE;
            }
            uRLSessionTask.close$SkipFoundation();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private static final Unit withDelegates$lambda$17(Object obj, Function1 function1, Object obj2) {
        if (obj != null) {
            function1.invoke(obj);
        }
        if (obj2 != null) {
            function1.invoke(obj2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public void cancel() {
        ?? obj = new Object();
        this.lock.withLock(new glj(this, obj, 0));
        completion$SkipFoundation(null, null, (Error) obj.a);
    }

    public void completion$SkipFoundation(Data data, URLResponse response, Error error) {
        URLSessionTaskDelegate uRLSessionTaskDelegate;
        this.lock.withLock(new wnh(27, this, error));
        this.session.taskDidComplete$SkipFoundation(this);
        Function3<Data, URLResponse, Error, Unit> function3 = this.completionHandler;
        if (function3 != null) {
            function3.invoke(data, response, error);
        }
        URLSessionTaskDelegate delegate = getDelegate();
        URLSessionDelegate delegate2 = this.session.getDelegate();
        if (delegate2 instanceof URLSessionTaskDelegate) {
            uRLSessionTaskDelegate = (URLSessionTaskDelegate) delegate2;
        } else {
            uRLSessionTaskDelegate = null;
        }
        withDelegates$SkipFoundation(delegate, uRLSessionTaskDelegate, new ivi(20, this, error));
    }

    public final Function1<Request.Builder, Unit> getBuild$SkipFoundation() {
        return this.build;
    }

    public final Function3<Data, URLResponse, Error, Unit> getCompletionHandler$SkipFoundation() {
        return this.completionHandler;
    }

    public long getCountOfBytesClientExpectsToReceive() {
        return this.countOfBytesClientExpectsToReceive;
    }

    public long getCountOfBytesClientExpectsToSend() {
        return this.countOfBytesClientExpectsToSend;
    }

    public final long getCountOfBytesExpectedToReceive() {
        return this.countOfBytesExpectedToReceive;
    }

    public final long getCountOfBytesExpectedToSend() {
        return this.countOfBytesExpectedToSend;
    }

    public final long getCountOfBytesReceived() {
        return this.countOfBytesReceived;
    }

    public final long getCountOfBytesSent() {
        return this.countOfBytesSent;
    }

    /* renamed from: getCurrentRequest, reason: from getter */
    public URLRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public URLSessionTaskDelegate getDelegate() {
        return (URLSessionTaskDelegate) StructKt.sref(this.lock.withLock(new flj(this, 2)), new elj(this, 1));
    }

    public Date getEarliestBeginDate() {
        return (Date) StructKt.sref$default(this.earliestBeginDate, null, 1, null);
    }

    public Error getError() {
        return (Error) this.lock.withLock(new flj(this, 1));
    }

    /* renamed from: getLock$SkipFoundation, reason: from getter */
    public final NSRecursiveLock getLock() {
        return this.lock;
    }

    public final URLRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public float getPriority() {
        return ((Number) this.lock.withLock(new flj(this, 3))).floatValue();
    }

    public final Object getProgress() {
        return this.progress;
    }

    /* renamed from: getSession$SkipFoundation, reason: from getter */
    public final URLSession getSession() {
        return this.session;
    }

    public State getState() {
        return (State) this.lock.withLock(new flj(this, 4));
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public final int getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public void open$SkipFoundation(URLRequest request, URL with) {
        request.getClass();
        with.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public void resume() {
        ?? obj = new Object();
        this.lock.withLock(new glj(this, obj, 1));
        Object obj2 = obj.a;
        if (obj2 != null) {
            completion$SkipFoundation(null, null, (Error) obj2);
        }
    }

    public void setCountOfBytesClientExpectsToReceive(long j) {
        this.countOfBytesClientExpectsToReceive = j;
    }

    public void setCountOfBytesClientExpectsToSend(long j) {
        this.countOfBytesClientExpectsToSend = j;
    }

    public void setDelegate(URLSessionTaskDelegate uRLSessionTaskDelegate) {
        this.lock.withLock(new wnh(26, this, (URLSessionTaskDelegate) StructKt.sref$default(uRLSessionTaskDelegate, null, 1, null)));
    }

    public void setEarliestBeginDate(Date date) {
        this.earliestBeginDate = (Date) StructKt.sref$default(date, null, 1, null);
    }

    public void setPriority(float f) {
        this.lock.withLock(new fm1(this, f, 1));
    }

    public void setTaskDescription(String str) {
        this.taskDescription = str;
    }

    public void suspend() {
        this.lock.withLock(new flj(this, 0));
    }

    public <D> void withDelegates$SkipFoundation(D task, D session, Function1<? super D, Unit> operation) {
        operation.getClass();
        if (task == null && session == null) {
            return;
        }
        this.session.getDelegateQueue().getRunBlock$SkipFoundation().invoke(new lrh(task, operation, 9, session));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000fB\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lskip/foundation/URLSessionTask$State;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "running", "suspended", "canceling", MetricTracker.Action.COMPLETED, "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class State implements RawRepresentable<Integer> {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final State running = new State("running", 0, 0, null, 2, null);
        public static final State suspended = new State("suspended", 1, 1, null, 2, null);
        public static final State canceling = new State("canceling", 2, 2, null, 2, null);
        public static final State completed = new State(MetricTracker.Action.COMPLETED, 3, 3, null, 2, null);

        private static final /* synthetic */ State[] $values() {
            return new State[]{running, suspended, canceling, completed};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ State(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/URLSessionTask$State$Companion;", "", "<init>", "()V", "init", "Lskip/foundation/URLSessionTask$State;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final State init(int rawValue) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        if (rawValue != 2) {
                            if (rawValue != 3) {
                                return null;
                            }
                            return State.completed;
                        }
                        return State.canceling;
                    }
                    return State.suspended;
                }
                return State.running;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private State(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lskip/foundation/URLSessionTask$Companion;", "Lskip/foundation/URLSessionTask$CompanionClass;", "<init>", "()V", "defaultPriority", "", "getDefaultPriority", "()F", "lowPriority", "getLowPriority", "highPriority", "getHighPriority", "State", "Lskip/foundation/URLSessionTask$State;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.URLSessionTask.CompanionClass
        public State State(int rawValue) {
            return State.INSTANCE.init(rawValue);
        }

        @Override // skip.foundation.URLSessionTask.CompanionClass
        public float getDefaultPriority() {
            return URLSessionTask.access$getDefaultPriority$cp();
        }

        @Override // skip.foundation.URLSessionTask.CompanionClass
        public float getHighPriority() {
            return URLSessionTask.access$getHighPriority$cp();
        }

        @Override // skip.foundation.URLSessionTask.CompanionClass
        public float getLowPriority() {
            return URLSessionTask.access$getLowPriority$cp();
        }

        private Companion() {
        }
    }

    @hm6
    public static /* synthetic */ void getEarliestBeginDate$annotations() {
    }

    @hm6
    public static /* synthetic */ void getProgress$annotations() {
    }

    public void close$SkipFoundation() {
    }

    public /* synthetic */ URLSessionTask(URLSession uRLSession, URLRequest uRLRequest, int i, Function1 function1, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uRLSession, uRLRequest, i, (i2 & 8) != 0 ? new pkj(9) : function1, (i2 & 16) != 0 ? null : function3);
    }
}
