//Import UIKit for UI elements 
import UIKit

//Create the different UI elements for the user interface 
let titleLabel = UILabel()
titleLabel.text = "Bridging the Gap"
titleLabel.font = UIFont.boldSystemFont(ofSize: 20)
titleLabel.textAlignment = .center
titleLabel.translatesAutoresizingMaskIntoConstraints = false

let mainImageView = UIImageView()
mainImageView.translatesAutoresizingMaskIntoConstraints = false
mainImageView.contentMode = .scaleAspectFit

let mainTextView = UITextView()
mainTextView.translatesAutoresizingMaskIntoConstraints = false
mainTextView.isEditable = false
mainTextView.isSelectable = false
mainTextView.backgroundColor = .clear
mainTextView.textColor = .black

let submitButton = UIButton()
submitButton.setTitle("Submit", for: .normal)
submitButton.setTitleColor(.black, for: .normal)
submitButton.backgroundColor = .systemBlue
submitButton.translatesAutoresizingMaskIntoConstraints = false

let stackView = UIStackView()
stackView.translatesAutoresizingMaskIntoConstraints = false

let view = UIView()
view.translatesAutoresizingMaskIntoConstraints = false
view.backgroundColor = .white

//Create a subview for displaying the image
let imageView = UIImageView()
imageView.translatesAutoresizingMaskIntoConstraints = false
imageView.contentMode = .scaleAspectFit

//Create constraints for the UI elements
let constraints = [
    titleLabel.topAnchor.constraint(equalTo: view.topAnchor, constant: 30),
    titleLabel.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 10),
    titleLabel.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -10),
    
    mainImageView.topAnchor.constraint(equalTo: titleLabel.bottomAnchor, constant: 20),
    mainImageView.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 10),
    mainImageView.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -10),
    mainImageView.heightAnchor.constraint(equalToConstant: 200),
    
    imageView.topAnchor.constraint(equalTo: mainImageView.topAnchor, constant: 10),
    imageView.leadingAnchor.constraint(equalTo: mainImageView.leadingAnchor, constant: 10),
    imageView.bottomAnchor.constraint(equalTo: mainImageView.bottomAnchor, constant: -10),
    imageView.trailingAnchor.constraint(equalTo: mainImageView.trailingAnchor, constant: -10),
    
    mainTextView.topAnchor.constraint(equalTo: mainImageView.bottomAnchor, constant: 10),
    mainTextView.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 10),
    mainTextView.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -10),
    mainTextView.heightAnchor.constraint(equalToConstant: 100),
    
    submitButton.topAnchor.constraint(equalTo: mainTextView.bottomAnchor, constant: 30),
    submitButton.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 30),
    submitButton.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -30),
    submitButton.heightAnchor.constraint(equalToConstant: 50)
]

//Create function to handle submitting the form
func submitForm(){
    //Do something
}

//Add the elements to the view
view.addSubview(titleLabel)
view.addSubview(mainImageView)
mainImageView.addSubview(imageView)
view.addSubview(mainTextView)
view.addSubview(submitButton)

//Add target to submit button
submitButton.addTarget(self, action: #selector(submitForm), for: .touchUpInside)

//Add the constraints to the view
NSLayoutConstraint.activate(constraints)