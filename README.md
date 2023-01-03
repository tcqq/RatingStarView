[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)
[![JitPack](https://jitpack.io/v/tcqq/RatingStarView.svg)](https://jitpack.io/#tcqq/RatingStarView)
[![Licence](https://img.shields.io/badge/Licence-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# RatingStarView

View for displaying rating star.

# Usage
``` 
<com.tcqq.ratingstarview.RatingStarView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
``` 

``` 
rating_star_view.apply {
    setOneRatingPercent(2)
    setTwoRatingPercent(60)
    setThreeRatingPercent(30)
    setFourRatingPercent(80)
    setFiveRatingPercent(100)
    setRating(4.3F)
    setReviewSize("58 reviews")
}
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
    // Using RatingStarView
    implementation 'com.github.tcqq:ratingstarview:3.0.0'
}
```

# Screenshots

![Screenshot](/screenshots/screenshot.png)

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
