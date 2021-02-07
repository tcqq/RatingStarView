[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)
[![JitPack](https://jitpack.io/v/tcqq/ReviewScoreView.svg)](https://jitpack.io/#tcqq/ReviewScoreView)
[![Licence](https://img.shields.io/badge/Licence-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# ReviewScoreView

View for displaying review scores.

# Usage
``` 
<com.tcqq.reviewscoreview.ReviewScoreView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
``` 

``` 
review_score_view.setRatingProgress(one: Int, two: Int, three: Int, four: Int, five: Int)
review_score_view.setRating(rating: Float)
review_score_view.setReviewSize(size: Int)
``` 

# Setup
#### build.gradle
```
repositories {
    maven { url 'https://jitpack.io' }
}
```
```
dependencies {
    // Using ReviewScoreView
    implementation 'com.github.tcqq:reviewscoreview:1.0.2'
}
```

# Screenshots

![Screenshot](/screenshots/screenshot_1.png)

License
-------

Copyright 2019 Perry Lance

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
