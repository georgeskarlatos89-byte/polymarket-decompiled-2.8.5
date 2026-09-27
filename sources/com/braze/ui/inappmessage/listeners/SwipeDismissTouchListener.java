package com.braze.ui.inappmessage.listeners;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import defpackage.ye0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private int mSwipingVerticalSlop;
    private boolean mSwipingVertically;
    private final Object mToken;
    private float mTranslationX;
    private float mTranslationY;
    private VelocityTracker mVelocityTracker;
    private final VerticalDismissDirection mVerticalDismissDirection;
    private final View mView;
    private int mViewWidth = 1;
    private int mViewHeight = 1;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public enum VerticalDismissDirection {
        NONE,
        UP,
        DOWN
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks, VerticalDismissDirection verticalDismissDirection) {
        long j;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        try {
            j = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        } catch (Resources.NotFoundException unused) {
            j = 200;
        }
        this.mAnimationTime = j;
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
        this.mVerticalDismissDirection = verticalDismissDirection;
    }

    public static /* synthetic */ void a(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        swipeDismissTouchListener.lambda$performDismiss$0(layoutParams, valueAnimator);
    }

    public static /* synthetic */ View access$000(SwipeDismissTouchListener swipeDismissTouchListener) {
        return swipeDismissTouchListener.mView;
    }

    public static /* synthetic */ Object access$100(SwipeDismissTouchListener swipeDismissTouchListener) {
        return swipeDismissTouchListener.mToken;
    }

    public static /* synthetic */ DismissCallbacks access$200(SwipeDismissTouchListener swipeDismissTouchListener) {
        return swipeDismissTouchListener.mCallbacks;
    }

    private void handleHorizontalActionUp(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        float rawX = motionEvent.getRawX() - this.mDownX;
        float xVelocity = this.mVelocityTracker.getXVelocity();
        float abs = Math.abs(xVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
        boolean z4 = true;
        boolean z5 = false;
        if (Math.abs(rawX) > this.mViewWidth / 2 && this.mSwiping) {
            if (rawX > 0.0f) {
                z5 = true;
            }
        } else if (this.mMinFlingVelocity <= abs && abs <= this.mMaxFlingVelocity && abs2 < abs && this.mSwiping) {
            if (xVelocity < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (rawX < 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xVelocity <= 0.0f) {
                z4 = false;
            }
            z5 = z4;
            z4 = z3;
        } else {
            z4 = false;
        }
        if (z4) {
            ViewPropertyAnimator animate = this.mView.animate();
            int i = this.mViewWidth;
            if (!z5) {
                i = -i;
            }
            animate.translationX(i).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SwipeDismissTouchListener.this.performDismiss();
                }
            });
            return;
        }
        if (this.mSwiping) {
            this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
        }
    }

    private void handleVerticalActionUp(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float rawY = motionEvent.getRawY() - this.mDownY;
        float yVelocity = this.mVelocityTracker.getYVelocity();
        float abs = Math.abs(yVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getXVelocity());
        boolean z4 = true;
        boolean z5 = false;
        if (Math.abs(rawY) > this.mViewHeight / 2) {
            if (rawY > 0.0f) {
                z5 = true;
            }
        } else if (this.mMinFlingVelocity <= abs && abs <= this.mMaxFlingVelocity && abs2 < abs) {
            if (yVelocity < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (rawY < 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (yVelocity <= 0.0f) {
                z4 = false;
            }
            z5 = z4;
            z4 = z3;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z5) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            if (isVerticalSwipeInAllowedDirection(f)) {
                ViewPropertyAnimator animate = this.mView.animate();
                int i = this.mViewHeight;
                if (!z5) {
                    i = -i;
                }
                animate.translationY(i).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SwipeDismissTouchListener.this.performDismiss();
                    }
                });
                return;
            }
        }
        this.mView.animate().translationY(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
    }

    private boolean isVerticalSwipeInAllowedDirection(float f) {
        VerticalDismissDirection verticalDismissDirection = this.mVerticalDismissDirection;
        if (verticalDismissDirection == VerticalDismissDirection.DOWN) {
            if (f > 0.0f) {
                return true;
            }
            return false;
        }
        if (verticalDismissDirection == VerticalDismissDirection.UP && f < 0.0f) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    private void requestDisallowParentIntercept(MotionEvent motionEvent) {
        this.mView.getParent().requestDisallowInterceptTouchEvent(true);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
        this.mView.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void resetTransientState() {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mDownX = 0.0f;
        this.mDownY = 0.0f;
        this.mSwiping = false;
        this.mSwipingVertically = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.offsetLocation(this.mTranslationX, this.mTranslationY);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        if (this.mViewHeight < 2) {
            this.mViewHeight = this.mView.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.mVelocityTracker != null) {
                        this.mView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
                        this.mVelocityTracker.recycle();
                        this.mVelocityTracker = null;
                        resetTransientState();
                    }
                } else {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.mDownX;
                        float rawY = motionEvent.getRawY() - this.mDownY;
                        if (!this.mSwiping && !this.mSwipingVertically) {
                            if (Math.abs(rawX) > this.mSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                                this.mSwiping = true;
                                int i = this.mSlop;
                                if (rawX <= 0.0f) {
                                    i = -i;
                                }
                                this.mSwipingSlop = i;
                                requestDisallowParentIntercept(motionEvent);
                            } else if (this.mVerticalDismissDirection != VerticalDismissDirection.NONE && Math.abs(rawY) > this.mSlop && Math.abs(rawX) < Math.abs(rawY) / 2.0f && isVerticalSwipeInAllowedDirection(rawY)) {
                                this.mSwipingVertically = true;
                                int i2 = this.mSlop;
                                if (rawY <= 0.0f) {
                                    i2 = -i2;
                                }
                                this.mSwipingVerticalSlop = i2;
                                requestDisallowParentIntercept(motionEvent);
                            }
                        }
                        if (this.mSwiping) {
                            this.mTranslationX = rawX;
                            this.mView.setTranslationX(rawX - this.mSwipingSlop);
                            return true;
                        }
                        if (this.mSwipingVertically) {
                            this.mTranslationY = rawY;
                            this.mView.setTranslationY(rawY - this.mSwipingVerticalSlop);
                            return true;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    this.mVelocityTracker.computeCurrentVelocity(1000);
                    if (this.mSwipingVertically) {
                        handleVerticalActionUp(motionEvent);
                    } else {
                        handleHorizontalActionUp(motionEvent);
                    }
                    this.mVelocityTracker.recycle();
                    this.mVelocityTracker = null;
                    resetTransientState();
                }
            }
            return false;
        }
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        if (this.mCallbacks.canDismiss(this.mToken)) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.mVelocityTracker = obtain;
            obtain.addMovement(motionEvent);
        }
        return false;
    }

    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.access$200(SwipeDismissTouchListener.this).onDismiss(SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this), SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this));
                SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setAlpha(1.0f);
                SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setTranslationX(0.0f);
                SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setTranslationY(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ye0(2, this, layoutParams));
        duration.start();
    }
}
