const images = [
    "images/img1.jpg",
    "images/img2.jpg",
    "images/img3.jpg",
    "images/img4.jpg",
    "images/img5.jpg",
    "images/img6.jpg",
    "images/img7.jpg",
    "images/img8.jpg",
    "images/img9.jpg",
    "images/img10.jpg"
];

let currentIndex = 0;
const sliderImage = document.getElementById("sliderImage");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

function updateImage() {
    sliderImage.src = images[currentIndex];
}


updateImage();


nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length; 
    updateImage();
});


prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length; 
    updateImage();
});
